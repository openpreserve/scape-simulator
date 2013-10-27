package eu.scape_project.pw.simulator.engine.model;



public abstract class EventObserver implements IEventObserver {

	protected String observedEvent; 
	
	public String observes() {
		return observedEvent;
	}
}
