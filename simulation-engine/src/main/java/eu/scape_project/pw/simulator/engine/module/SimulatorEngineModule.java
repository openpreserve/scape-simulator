package eu.scape_project.pw.simulator.engine.module;

import com.google.inject.AbstractModule;

import eu.scape_project.pw.simulator.engine.recorder.IRecorder;
import eu.scape_project.pw.simulator.engine.recorder.Recorder;
import eu.scape_project.simulator.engine.processor.EventProcessor;
import eu.scape_project.simulator.engine.processor.IEventProcessor;

public class SimulatorEngineModule extends AbstractModule{

	@Override
	protected void configure() {
		bind(IRecorder.class).to(Recorder.class);
		bind(IEventProcessor.class).to(EventProcessor.class);
		
	}

}
