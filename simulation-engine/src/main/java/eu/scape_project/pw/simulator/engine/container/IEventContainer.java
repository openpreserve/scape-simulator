package eu.scape_project.pw.simulator.engine.container;

import java.util.Collection;

import eu.scape_project.pw.simulator.engine.model.IEvent;

/**
 * 
 * @author Kresimir Duretec
 *
 */
public interface IEventContainer {

	IEvent getNextEvent();
	
	long getNextEventTime();
	
	void addEvent(IEvent event);
	
	void addEvents(Collection<IEvent> events);
	
	boolean isEmpty();
	
	int size();
}
