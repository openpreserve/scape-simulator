package eu.scape_project.pw.generator

import eu.scape_project.pw.simulator.Cluster
import eu.scape_project.pw.simulator.Collection
import eu.scape_project.pw.simulator.ConditionalScheduling
import eu.scape_project.pw.simulator.Disk
import eu.scape_project.pw.simulator.EventScheduling
import eu.scape_project.pw.simulator.FormatGroup
import eu.scape_project.pw.simulator.ObserverScheduling
import eu.scape_project.pw.simulator.Simulation
import eu.scape_project.pw.simulator.Storage
import java.util.HashMap
import java.util.List
import java.util.Map
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess

class InitializatorGenerator {

	//Resource res;
	Map<String, String> types = new HashMap<String, String>();
	Map<String, List<Double>> formatPerc; 
	FormatPercCalculator fpc ; 
	boolean iOperatorDefined = false;
	
	def getVarType(String name) {
		types.get(name)
	}

	def generateInitializator(Resource resource, IFileSystemAccess fsa) {

		fpc = new FormatPercCalculator();
		formatPerc = fpc.calculatePerc(resource);
		
		for (e : resource.allContents.toIterable.filter(typeof(Simulation))) {

			//generate SimulatorStateFactory
			fsa.generateFile("/simulator/" + e.name + "SimulatorStateFactory.java", generateSimulatorStateFactory(e))

			//generate EventContainerFactory
			fsa.generateFile("/simulator/" + e.name + "EventContainerFactory.java", generateEventContainerFactory(e))

			//generate EventContainerFactory
			fsa.generateFile("/simulator/" + e.name + "EventObserverContainerFactory.java",
				generateEventObserverContainerFactory(e))
				
			//generate ConditionalEventContainerFactory
			fsa.generateFile("/simulator/" + e.name + "ConditionalEventContainerFactory.java",
				generateConditionalEventContainerFactory(e))
		}
	}

	def generateSimulatorStateFactory(Simulation e) '''
		package simulator;
		import eu.scape_project.pw.simulator.engine.model.state.AbstractSimulationStateFactory;
		import eu.scape_project.pw.simulator.engine.model.state.utils.IOperator;
		import eu.scape_project.pw.simulator.engine.model.state.utils.SumOperator;
		
		public class «e.name»SimulatorStateFactory extends AbstractSimulationStateFactory {
			
			@Override 
			protected void initialize() {
			«generateSimulationState(e)»
			}
		}	
	'''

	def generateSimulationState(Simulation e) {
		var temp = ''''''
		for (ent : e.entities.filter(typeof(Storage))) {
			temp = temp + passStorage(ent)
		}
		for(ent : e.entities.filter(typeof(Cluster))) {
			temp = temp + passProcessing(ent)
		}
		for (ent : e.entities.filter(typeof(Collection))) {
			temp = temp + passEntity(ent)
		}
		for (ent : e.entities.filter(typeof(FormatGroup))) {
			temp = temp + passFormat(ent)
		}
		return temp
	}

	def passStorage(Storage s) {
		var temp = '''''';
		if ( s instanceof Disk ) {
			var h = s as Disk
			temp = temp + '''state.addStateVariable("«h.name + ".capacity"»" ,new Double(«h.capacity») , "GB");
				'''
			temp = temp + '''state.addAutoVariable("«h.name + ".used"»" ,new SumOperator(), "GB" );
				'''
			
		}
	}
	def passProcessing(Cluster p) {
		var temp = ''''''
		temp = temp + '''state.addStateVariable("«p.name + ".number_of_nodes"»", new Double(«p.number_of_nodes»), "number");
		'''
		temp = temp + '''state.addStateVariable("«p.name + ".nodes_used"»", new Double(0), "number");
		'''
	}
	def passEntity(Collection col) {
		var temp = '''''';
		var tempName = col.name;
		temp = temp + '''state.addAutoVariable("«tempName».size", new SumOperator(), "GB");
						 state.addAutoVariable("«tempName».number_of_objects", new SumOperator(), "number");
						 '''
		for (entry : col.entries) {
			var v1 = tempName + '.' + entry.format.name + '.' + 'size'
			var v2 = tempName + '.' + entry.format.name + '.' + 'number_of_objects'
			temp = temp + '''
				state.addStateVariable("«v1»", new Double(«entry.size»), "GB");
				state.addStateVariable("«v2»", new Double(«entry.num_objects»), "number");
							 '''
			temp = temp + '''
				state.addVariableToAutoVariable("«tempName».size","«v1»");
				state.addVariableToAutoVariable("«tempName».number_of_objects","«v2»"); 
						'''
		}
		
		// add size
		/*if (col.size != 0) {
			temp = temp + '''state.addStateVariable("«tempName + ".size"»" ,new Double(«col.size») );
				'''
			types.put(tempName + ".size", "float");
		}*/
		for (Storage s: col.storage) {
			if (s instanceof Disk) {
				var h = s as Disk
				temp = temp + '''state.addVariableToAutoVariable("«h.name».used", "«tempName».size");
				'''
			}
		}
		return temp
		/*for (k : col.keyValues) {
			if (k instanceof KeyValueInt) {
				var t = k as KeyValueInt
				temp = temp + '''
					state.addStateVariable("«tempName + "." + k.key»" ,«t.value» );
				'''
				types.put(tempName + "." + k.key, "int")
			} else if (k instanceof KeyValueString) {
				var t = k as KeyValueString
				temp = temp + '''
					state.addStateVariable("«tempName + "." + k.key»" ,"«t.value»" );
				'''
				types.put(tempName + "." + k.key, "String")
			} else if (k instanceof KeyValueDecimal) {
				var t = k as KeyValueDecimal
				temp = temp + '''
					state.addStateVariable("«tempName + "." + k.key»" ,«t.value» );
				'''
				types.put(tempName + "." + k.key, "float")
			}
		}
		var subcol = new ArrayList<String>();
		if (col.subCollections.length == 0) {
			return temp
		} else {
			for (s : col.subCollections) {
				temp = temp + passEntity(s, tempName)
				subcol.add(tempName + '.' + s.name)
			}
			temp = temp + addAutoVariables(tempName, subcol)
			return temp
		}*/

	}

	def addAutoVariables(String name, List<String> c) {
		var temp = ''''''
		if (iOperatorDefined == false) {
			temp = temp + '''IOperator op;
			'''
			iOperatorDefined = true;
		}
		temp = temp + '''op = new SumOperator();
			'''
		for (s : c) {
			temp = temp + '''op.addVariableName("«s».size");
				'''
		}
		temp = temp + '''state.addAutoVariable("«name +".size"»",op, "GB");
			'''
		return temp
	}

	def passFormat(FormatGroup f) {
		var temp = ''''''
		for (e :formatPerc.entrySet) {
			var name = e.key;
			var List<Double> value = e.value;
			temp = temp + '''state.addStateVariable("«name»" ,new Double(«value.get(0)»), "percentage" );
				'''
		}
		return temp;
	}
	
	def generateEventContainerFactory(Simulation e) '''
		package simulator;
		import eu.scape_project.pw.simulator.engine.container.AbstractEventContainerFactory;
		import eu.scape_project.pw.simulator.engine.model.IEvent;
			
		public class «e.name»EventContainerFactory extends AbstractEventContainerFactory {
				
			@Override 
			protected void initialize() {
			«generateEventContainer(e)»
			}
		}	
	'''

	def generateEventContainer(Simulation e) {
		var temp = '''
			int current = 0; 
		'''
		for (sch : e.scheduling.filter(typeof(EventScheduling))) {
			temp = temp + generateEventSchedules(e, sch)
		}	
		temp = temp + generateFormatEvents()
		return temp
	}

	def generateEventSchedules(Simulation s, EventScheduling es) {
		var temp = ''' 
			// scheduling «es.schedule.name» event
			current = «calculateEventStart(s, es)»;
			while (current <= «calculateEventEnd(s, es)») {
				IEvent tmp = new «es.schedule.name»();
				tmp.setScheduleTime(current);
				eventContainer.addEvent(tmp);
				current = current + «es.every»;
			} 
		'''
		return temp
	}
	
	def calculateEventStart(Simulation s, EventScheduling es) {
		var month = (es.startYear - s.startYear - 1)*12 + 13 - s.startMonth + es.startMonth - 1
		return month
	}
	
	def calculateEventEnd(Simulation s, EventScheduling es) {
		var month = (es.endYear - s.startYear - 1)*12 + 13 - s.startMonth + es.endMonth - 1
		return month
	}
	
	def generateFormatEvents() {
		var temp = '''IEvent formatEvent;
		'''
		for (e :formatPerc.entrySet) {
			var name = e.key;
			var List<Double> value = e.value;
			var time = 0;
			for (k:value) {
				temp = temp + '''
					formatEvent = new SetFormatEntryPerc("«name»",new Double(«k»));
					formatEvent.setScheduleTime(«time»);
					eventContainer.addEvent(formatEvent);
				'''		
				time = time + 12 
			}
			
		}
		return temp;
	}

	def generateEventObserverContainerFactory(Simulation e) '''
		package simulator;
		import eu.scape_project.pw.simulator.engine.container.AbstractEventObserverContainerFactory;
		
		public class «e.name»EventObserverContainerFactory extends AbstractEventObserverContainerFactory {
			
			@Override 
			protected void initialize() {
			«generateEventObserverContainer(e)»
			}
		}
	'''

	def generateEventObserverContainer(Simulation e) {
		var temp = ''''''
		for (sch : e.scheduling.filter(typeof(ObserverScheduling))) {
			temp = temp + '''
				eOContainer.addEventObserver(new «sch.observes.name»2«sch.schedule.name»());
			'''
		}
		return temp
	}
	
	def generateConditionalEventContainerFactory(Simulation e) '''
		package simulator;
		import eu.scape_project.pw.simulator.engine.container.AbstractConditionalEventContainerFactory;
		
		public class «e.name»ConditionalEventContainerFactory extends AbstractConditionalEventContainerFactory {
			
			@Override 
			protected void initialize() {
				«generateConditionalEvent(e)»
			}
		}
	'''
	
	def generateConditionalEvent(Simulation e) {
		var temp = ''''''
	 	for (s : e.scheduling.filter(typeof(ConditionalScheduling))) {
			temp = temp + '''
				icContainer.addCondition(new «s.name»Condition());
			'''
		}
		return temp
	}
		
	
}
