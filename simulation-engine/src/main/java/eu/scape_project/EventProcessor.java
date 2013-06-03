package eu.scape_project;


public class EventProcessor {
	
	private EventContainer eventContainer;

	public void initialize(EventContainer eC) {
		
		eventContainer = eC;
		
	}
	
	public void startSimulation() {
		
		while (!eventContainer.isEmpty()){
			IEvent event = eventContainer.getNextEvent();
			event.execute(this);	
		}
		
	}
	
	public EventContainer getEventContainer() {
		return eventContainer;
	}
	

}
