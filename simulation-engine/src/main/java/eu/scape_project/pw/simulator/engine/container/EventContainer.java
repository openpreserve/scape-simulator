package eu.scape_project.pw.simulator.engine.container;

import java.util.Collection;
import java.util.PriorityQueue;

import eu.scape_project.pw.simulator.engine.model.IEvent;

public class EventContainer implements IEventContainer{

	PriorityQueue<IEvent> events;

	public EventContainer() {
		
		events = new PriorityQueue<IEvent>();
	
	}
	
	public IEvent getNextEvent() {
		
		if (!isEmpty()) {
			return events.poll();
		}
		return null;
		
	}
	
	public long getNextEventTime() {
		if (events.isEmpty()) {
			return -1;
		}
		return events.peek().getScheduleTime();
	}
	
	public void addEvent(IEvent event) {
		
		events.add(event);
		
	}
	
	public void addEvents(Collection<IEvent> newEvents) {
		
		events.addAll(newEvents);
		
	}
	
	public boolean isEmpty() {
		
		return events.isEmpty();
		
	}
	
	public int size() {
		return events.size();
	}
}
