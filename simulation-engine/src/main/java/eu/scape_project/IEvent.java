package eu.scape_project;

public interface IEvent extends Comparable<IEvent> {

	void execute(EventProcessor eP);
	
	long getScheduleTime();
}
