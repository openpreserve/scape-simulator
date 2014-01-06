/*
 * generated by Xtext
 */
package eu.scape_project.pw.generator

import com.google.inject.Inject
import eu.scape_project.pw.simulator.ConditionalScheduling
import eu.scape_project.pw.simulator.EExpression
import eu.scape_project.pw.simulator.Event
import eu.scape_project.pw.simulator.Expression
import eu.scape_project.pw.simulator.MExpression
import eu.scape_project.pw.simulator.Normal
import eu.scape_project.pw.simulator.OExpression
import eu.scape_project.pw.simulator.PExpression
import eu.scape_project.pw.simulator.RExpression
import eu.scape_project.pw.simulator.RightSide
import eu.scape_project.pw.simulator.Simulation
import eu.scape_project.pw.simulator.Uniform
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.xbase.compiler.XbaseCompiler

class SimulatorGenerator implements IGenerator {

	@Inject
	protected XbaseCompiler xbaseCompiler

	InitializatorGenerator iGenerator;

	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		iGenerator = new InitializatorGenerator()
		for (e : resource.allContents.toIterable.filter(typeof(Simulation))) {
			fsa.generateFile("/simulator/" + e.name + "SimulationProperties.java", e.createProperties)
			fsa.generateFile("/simulator/" + e.name + ".java", e.createMain)
			fsa.generateFile("/simulator/" + e.name + "SimulatorModule.java", e.createModule)
		}
		iGenerator.generateInitializator(resource, fsa);

		for (e : resource.allContents.toIterable.filter(typeof(Event))) {
			fsa.generateFile("/simulator/" + e.name + ".java", e.compileEvent)
		}

		for (e : resource.allContents.toIterable.filter(typeof(ConditionalScheduling))) {
			fsa.generateFile("/simulator/" + e.observes.name + "2" + e.schedule.name + ".java",
				e.compileConditionalScheduling)
		}

	}

	/**
 	 * 
 	 */
	def createProperties(Simulation s) '''
		package simulator;
		import eu.scape_project.pw.simulator.engine.model.SimulationProperties;
		
		public class «s.name»SimulationProperties extends SimulationProperties {
			
			«s.name»SimulationProperties() {
				name="«s.name»";
				numberOfRuns = «s.runs»;		
			}
		}
	'''

	/**
	 * generate main file 
	 */
	def createMain(Simulation s) '''
		
		package simulator;
		import com.google.inject.Guice;
		import com.google.inject.Injector;
		
		import eu.scape_project.simulator.engine.processor.IEventProcessor;
		
		public class «s.name» { 
			public static void main(String[] args) {
				Injector injector = Guice.createInjector(new «s.name»SimulatorModule());
							IEventProcessor processor = injector.getInstance(IEventProcessor.class); 
				processor.startSimulation();
			}
		}
		
	'''

	def createModule(Simulation s) '''
		package simulator;
		import eu.scape_project.pw.simulator.engine.container.IEventContainerFactory;
		import eu.scape_project.pw.simulator.engine.container.IEventObserverContainerFactory;
		import eu.scape_project.pw.simulator.engine.model.ISimulationProperties;
		import eu.scape_project.pw.simulator.engine.model.state.ISimulationStateFactory;
		import eu.scape_project.pw.simulator.engine.module.SimulatorEngineModule;
		
		public class «s.name»SimulatorModule extends SimulatorEngineModule {
			
			«s.name»SimulatorModule() {	
			}
			
			@Override
			protected void configure() {
				super.configure();
				bind(IEventContainerFactory.class).to(«s.name»EventContainerFactory.class);
				bind(IEventObserverContainerFactory.class).to(«s.name»EventObserverContainerFactory.class);
				bind(ISimulationStateFactory.class).to(«s.name»SimulatorStateFactory.class);
				bind(ISimulationProperties.class).to(«s.name»SimulationProperties.class);
			}
		}
	'''

	def compileEvent(Event e) '''
		
		package simulator;
		import eu.scape_project.pw.simulator.engine.model.Event;
		import eu.scape_project.pw.simulator.engine.model.state.ISimulationState;
		import eu.scape_project.pw.simulator.engine.utils.RandomNumberGenerator;
		
		public class «e.name» extends Event{ 
			 	
		
			public «e.name»() {
			name = "«e.name»";
			}
		
				@Override
				public void execute(ISimulationState state) {
					«compileExpression(e.expression)»
				}
		}
		
	'''

	def compileExpression(Expression e) {

		switch e {
			RExpression: compileRExpression(e)
			OExpression: compileOExpression(e)
		}

	}

	def compileRExpression(RExpression r) {

		var temp = '''
		for (int i=0; i<''' + r.number + '''; i++) {
			'''
		for (e : r.expression) {
			temp = temp + compileExpression(e)
		}
		temp = temp + '''}'''
	}

	def compileOExpression(OExpression o) {
		switch o {
			PExpression: compilePExpression(o)
			MExpression: compileMExpression(o)
			EExpression: compileEExpression(o)
		}
	}

	def compilePExpression(PExpression p) {
		var temp = '''state.addStateVariable("'''
		temp = temp + p.leftSide
		temp = temp + '''",'''
		if (iGenerator.getVarType(p.leftSide) == "int") {
			temp = temp + '''((Integer)state.getStateVariable("''' + p.leftSide + '''")).intValue()'''
		} else if (iGenerator.getVarType(p.leftSide) == "float") {
			temp = temp + '''((Double)state.getStateVariable("''' + p.leftSide + '''")).doubleValue()'''
		} else if (iGenerator.getVarType(p.leftSide) == "String") {
			temp = temp + '''((String)state.getStateVariable("''' + p.leftSide + '''"))'''
		}
		temp = temp + '''+''' + compileRightSide(p.rightSide) + ''');''' + "\n"
		temp
	}

	def compileMExpression(MExpression p) {
		var temp = '''state.addStateVariable("'''
		temp = temp + p.leftSide
		temp = temp + '''",'''
		if (iGenerator.getVarType(p.leftSide) == "int") {
			temp = temp + '''((Integer)state.getStateVariable("''' + p.leftSide + '''")).intValue()'''
		} else if (iGenerator.getVarType(p.leftSide) == "float") {
			temp = temp + '''((Double)state.getStateVariable("''' + p.leftSide + '''")).doubleValue()'''
		} else if (iGenerator.getVarType(p.leftSide) == "String") {
			temp = temp + '''((String)state.getStateVariable("''' + p.leftSide + '''"))'''
		}
		temp = temp + '''-''' + compileRightSide(p.rightSide) + ''');''' + "\n"
		temp
	}

	def compileEExpression(EExpression p) {
		var temp = '''state.addStateVariable("'''
		temp = temp + p.leftSide
		temp = temp + '''",'''
		temp = temp + compileRightSide(p.rightSide) + ''');'''
		temp
	}

	def compileRightSide(RightSide rs) {
		switch rs {
			Uniform: compileRandom(rs)
			Normal: compileRandom(rs)
		}
	}

	def compileRandom(Uniform u) {
		var temp = '''RandomNumberGenerator.uniform(«u.a»,«u.b»)'''
		temp
	}
	def compileRandom(Normal n) {
		var temp = '''RandomNumberGenerator.normal(«n.mean»,«n.std»)'''
		temp
	}
	
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
