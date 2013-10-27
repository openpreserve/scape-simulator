package eu.scape_project.pw.simulator.engine.container;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import eu.scape_project.pw.simulator.engine.model.IEventObserver;

public class EventObserverContainer implements IEventObserverContainer {

	private Map<String, List<IEventObserver>> observers;

	public EventObserverContainer() {
		observers = new HashMap<String, List<IEventObserver>>();
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
	
	public List<IEventObserver> get(String name) {
		return observers.get(name);
	}
}
