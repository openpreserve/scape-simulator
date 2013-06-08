package eu.scape_project;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;


public class EventProcessor {
	
	private EventContainer eventContainer;

	private Map<String, List<IEventObserver>> observers;
	
	private SimulationState state;
	
	public EventProcessor() {
		observers = new TreeMap<String, List<IEventObserver>>();
		state = new SimulationState();
	}
	
	public void initialize(EventContainer eC) {
		
		eventContainer = eC;
		
	}
	
	public void addEventObserver(IEventObserver eObserver) {
		
		if (observers.containsKey(eObserver.observes())) {
			observers.get(eObserver.observes()).add(eObserver);
		} else {
			List<IEventObserver> tmp = new ArrayList<IEventObserver>();
			tmp.add(eObserver);
			observers.put(eObserver.observes(), tmp);
		}
		
	}
	public void startSimulation() {
		
		while (!eventContainer.isEmpty()){
			IEvent event = eventContainer.getNextEvent();
			state.setTime(event.getScheduleTime());
			event.execute(state);
			List<IEventObserver> tmp = observers.get(event.getName());
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
	

}
