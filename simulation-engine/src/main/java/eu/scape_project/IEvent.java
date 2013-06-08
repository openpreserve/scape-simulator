package eu.scape_project;

public interface IEvent extends Comparable<IEvent> {

	void execute(SimulationState state);
	
	long getScheduleTime();
	
	void setScheduleTime(long time);
	
	String getName();
}
