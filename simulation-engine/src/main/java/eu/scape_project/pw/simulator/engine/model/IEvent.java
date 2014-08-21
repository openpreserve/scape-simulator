package eu.scape_project.pw.simulator.engine.model;

import eu.scape_project.pw.simulator.engine.model.state.ISimulationState;

public interface IEvent extends Comparable<IEvent> {

	boolean execute(ISimulationState state);
	
	long getScheduleTime();
	
	void setScheduleTime(long time);
	
	String getName();
}
