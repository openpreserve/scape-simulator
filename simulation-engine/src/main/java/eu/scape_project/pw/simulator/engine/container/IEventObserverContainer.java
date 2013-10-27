package eu.scape_project.pw.simulator.engine.container;

import java.util.List;

import eu.scape_project.pw.simulator.engine.model.IEventObserver;

public interface IEventObserverContainer {

	void addEventObserver(IEventObserver eObserver);
	
	List<IEventObserver> get(String name);
}
