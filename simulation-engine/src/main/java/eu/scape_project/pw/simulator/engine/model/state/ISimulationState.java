package eu.scape_project.pw.simulator.engine.model.state;

import java.util.Iterator;

public interface ISimulationState {

	long getTime();
	
	void setTime(long t);
	
	void addStateVariable(String name, Object value);
	
	Object getStateVariable(String name);
	
	public Iterator getIterator();
}
