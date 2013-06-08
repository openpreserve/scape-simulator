package eu.scape_project;

public interface IEventObserver {

	String observes();
	
	IEvent schedules(SimulationState state);
	
}
