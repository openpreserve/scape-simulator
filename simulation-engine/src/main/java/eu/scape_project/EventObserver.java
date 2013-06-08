package eu.scape_project;

public abstract class EventObserver implements IEventObserver {

	protected String observedEvent; 
	
	public String observes() {
		return observedEvent;
	}
}
