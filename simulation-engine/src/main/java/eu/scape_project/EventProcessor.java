package eu.scape_project;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;


public class EventProcessor {
	
	private EventContainer eventContainer;

	private EventObserverContainer eOContainer;
	
	private SimulationState state;
	
	public EventProcessor() { }
	
	
	public void startSimulation() {
		
		while (!eventContainer.isEmpty()){
			IEvent event = eventContainer.getNextEvent();
			state.setTime(event.getScheduleTime());
			event.execute(state);
			List<IEventObserver> tmp = eOContainer.get(event.getName());
			if (tmp != null) {
				for (IEventObserver observer : tmp) {
					eventContainer.addEvent(observer.schedules(state));
				}
			}
		}
		
	}


	public EventContainer getEventContainer() {
		return eventContainer;
	}


	public void setEventContainer(EventContainer eventContainer) {
		this.eventContainer = eventContainer;
	}


	public EventObserverContainer getEOContainer() {
		return eOContainer;
	}


	public void setEOContainer(EventObserverContainer eOContainer) {
		this.eOContainer = eOContainer;
	}


	public SimulationState getSimulationState() {
		return state;
	}


	public void setSimulationState(SimulationState state) {
		this.state = state;
	}
	
	
	

}
