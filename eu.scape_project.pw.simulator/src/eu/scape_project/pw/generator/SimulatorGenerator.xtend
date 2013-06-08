/*
 * generated by Xtext
 */
package eu.scape_project.pw.generator

import eu.scape_project.pw.simulator.ConditionalScheduling
import eu.scape_project.pw.simulator.Event
import eu.scape_project.pw.simulator.EventScheduling
import eu.scape_project.pw.simulator.Scheduling
import eu.scape_project.pw.simulator.Simulation
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator

class SimulatorGenerator implements IGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		for (e : resource.allContents.toIterable.filter(typeof(Simulation))) {
			fsa.generateFile("/simulator/" + e.name + ".java", e.compile)
		}
		
		for (e : resource.allContents.toIterable.filter(typeof(Event))) {
			fsa.generateFile("/simulator/" + e.name + ".java", e.compileEvent)
		}
		
		for (e : resource.allContents.toIterable.filter(typeof(ConditionalScheduling))) {
			fsa.generateFile("/simulator/" + e.observes.name + "2" + e.schedule.name + ".java", e.compileConditionalScheduling)
		}
	}

	def compile(Simulation s) '''
		
		package simulator;
		import eu.scape_project.*;
		public class «s.name» { 
			public static void main(String[] args) {
				EventContainer container = new EventContainer();
				EventProcessor processor = new EventProcessor();
				int tmp;
				int start;
				IEventObserver tmpEvent;		
				«FOR sch : s.scheduling.filter(typeof(EventScheduling))» «sch.compileEventSchedulingMain» «ENDFOR»
				«FOR sch : s.scheduling.filter(typeof(ConditionalScheduling))» «sch.compileConditionalEventSchedulingMain» «ENDFOR»
				processor.initialize(container);
				processor.startSimulation(); 	
			}
		}
		
	'''
	
	
	def compileEventSchedulingMain(EventScheduling e) '''
		tmp = «e.repeat»;
		start = «e.start»;
		while (tmp>0) {
			IEvent event = new «e.schedule.name»();
			event.setScheduleTime(start);
			container.addEvent(event);
			start += «e.every»; 
			tmp-=1;
		}
	'''
	def compileConditionalEventSchedulingMain(ConditionalScheduling e) '''
		tmpEvent = new «e.observes.name»2«e.schedule.name»();
		processor.addEventObserver(tmpEvent);
	'''
	
	def compileEvent(Event e) '''
		
		package simulator;
		import eu.scape_project.*;
		public class «e.name» extends Event{ 
			 	

			public «e.name»() {
				name = "«e.name»";
			}
	
			@Override
			public void execute(SimulationState state) {
				System.out.println("Hello from event «e.name» at time " + state.getTime()); 
			}
		}
		
	'''
	
	def compileConditionalScheduling(ConditionalScheduling e) '''
	
	package simulator;
	import eu.scape_project.*;
	public class «e.observes.name»2«e.schedule.name» extends EventObserver {
		
		public «e.observes.name»2«e.schedule.name» () {
			observedEvent = "«e.observes.name»";
		}
		
		@Override
		public IEvent schedules(SimulationState state) { 
		
		 long currentTime = state.getTime();
		 IEvent tmp = new «e.schedule.name»();
		 tmp.setScheduleTime(currentTime + «e.delay»);
		 return tmp;	
		} 
	} 
	'''
}
