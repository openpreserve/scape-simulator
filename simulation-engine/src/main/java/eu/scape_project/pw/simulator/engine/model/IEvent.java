package eu.scape_project.pw.simulator.engine.model;

import eu.scape_project.ISimulationState;

public interface IEvent extends Comparable<IEvent> {

	void execute(ISimulationState state);
	
	long getScheduleTime();
	
	void setScheduleTime(long time);
	
	String getName();
}
