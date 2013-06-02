package eu.scape_project;

import java.util.Collection;
import java.util.PriorityQueue;

public class EventContainer {

	PriorityQueue<IEvent> events;

	EventContainer() {
		
		events = new PriorityQueue<IEvent>();
	
	}
	
	public IEvent getNextEvent() {
		
		if (!isEmpty()) {
			return events.poll();
		}
		return null;
		
	}
	
	public void addEvent(IEvent event) {
		
		events.add(event);
		
	}
	
	public void addEvents(Collection<IEvent> events) {
		
		events.addAll(events);
		
	}
	
	public boolean isEmpty() {
		
		return events.isEmpty();
		
	}
}
