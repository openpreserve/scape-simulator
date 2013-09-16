package eu.scape_project.pw.generator

import eu.scape_project.pw.simulator.KeyValue
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess

class InitializatorGenerator {
	
	
	def generateInitializator(Resource resource, IFileSystemAccess fsa) {
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
				eOContainer = new EventObserverConatiner();
				state = new SimulationState();
				 
			public EventContainer getEventContainer(){return eventContainer;}
			public EventObserverContainer getEOContainer() {return eOContainer;}
			public SimulationState getSimulationState() { return state; } 
			
			
			   
			
		}
	'''
}