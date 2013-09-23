package eu.scape_project.pw.generator

import eu.scape_project.pw.simulator.Collection
import eu.scape_project.pw.simulator.ConditionalScheduling
import eu.scape_project.pw.simulator.EventScheduling
import eu.scape_project.pw.simulator.KeyValue
import eu.scape_project.pw.simulator.KeyValueDecimal
import eu.scape_project.pw.simulator.KeyValueInt
import eu.scape_project.pw.simulator.KeyValueString
import eu.scape_project.pw.simulator.Simulation
import java.util.HashMap
import java.util.Map
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess

class InitializatorGenerator {
	
	Resource res;
	Map<String, String> types = new HashMap<String,String>(); 
	
	def getVarType(String name) {
		types.get(name)
	}
	
	def generateInitializator(Resource resource, IFileSystemAccess fsa) {
		res = resource;
		fsa.generateFile("/simulator/Initializator.java", generate)
		for (e : resource.allContents.toIterable.filter(typeof(KeyValue))) {
		}
	}
	
	def String generate() 
	'''
	package simulator;
		import eu.scape_project.*;
		public class Initializator {
			private EventContainer eventContainer; 
			private EventObserverContainer eOContainer;
			private SimulationState state;
			
			public Initializator() {
				eventContainer = new EventContainer();
				eOContainer = new EventObserverContainer();
				state = new SimulationState();
				generateSimulationState();
				generateEventContainer();
				generateEventObserverContainer();
			}
			
			public EventContainer getEventContainer(){return eventContainer;}
			public EventObserverContainer getEOContainer() {return eOContainer;}
			public SimulationState getSimulationState() { return state; } 
			
			private void generateSimulationState() {
				«generateSimulationState»
			   
			}
			
			private void generateEventContainer() {
				«generateEventContainer»
			}
			
			private void generateEventObserverContainer() {
				«generateEventObserverContainer»
			}
		}
	'''
	def generateSimulationState() {
		var temp = ''''''
		for (e : res.allContents.toIterable.filter(typeof(Simulation))) {
			for (ent : e.entities.filter(typeof(Collection))) {
			  temp = temp + passEntity(ent, "")
			}
		}
		return temp
	}
	
	def passEntity(Collection col, String name) {
		var temp = '''''';
		var tempName = ""; 
		if (name == "") {
			tempName = col.name
		}else {
			tempName = name + "." + col.name
		}
		for (k : col.keyValues) {
			if (k instanceof KeyValueInt) {
				var t = k as KeyValueInt
				temp = temp + 
				'''
					state.addStateVariable("«tempName+"."+k.key»" ,«t.value» );
				'''
				types.put(tempName+"."+k.key, "int")
			}else if (k instanceof KeyValueString) {
				var t = k as KeyValueString
				temp = temp + 
				'''
					state.addStateVariable("«tempName+"."+k.key»" ,"«t.value»" );
				'''
				types.put(tempName+"."+k.key, "String")
			}else if (k instanceof KeyValueDecimal) {
				var t = k as KeyValueDecimal
				temp = temp + 
				'''
					state.addStateVariable("«tempName+"."+k.key»" ,«t.value» );
				'''
				types.put(tempName+"."+k.key, "float")
			}
		} 
			
		if (col.subCollections==null) {
			return temp
		}else {
			for (s : col.subCollections) {
				temp = temp + passEntity(s,tempName)
			}
			return temp
		}
		
	}
	
	def generateEventContainer() {
		var temp = '''
				int current = 0; 
			'''
		for (e : res.allContents.toIterable.filter(typeof(Simulation))) {
			for (sch : e.scheduling.filter(typeof(EventScheduling))) {
			  temp = temp + generateEventSchedules(sch)
			}
		}
		return temp
	}
	
	def generateEventSchedules(EventScheduling es){
		var temp = ''' 
			// scheduling «es.schedule.name» event
			current = «es.start»;
			while (current <= «es.end») {
				IEvent tmp = new «es.schedule.name»();
				tmp.setScheduleTime(current);
				eventContainer.addEvent(tmp);
				current = current + «es.every»;
			} 
			'''
		return temp
	}
	
	def generateEventObserverContainer() {
		var temp = ''''''
		for (e : res.allContents.toIterable.filter(typeof(Simulation))) {
			for (sch : e.scheduling.filter(typeof(ConditionalScheduling))) {
			  temp = temp + 
			  		'''
			  			eOContainer.addEventObserver(new «sch.observes.name»2«sch.schedule.name»());
			  		'''
			}
		}
		return temp
	}
}