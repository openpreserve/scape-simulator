package eu.scape_project.pw.simulator.engine.model.state;

import java.util.Iterator;

import eu.scape_project.pw.simulator.engine.model.state.utils.IOperator;

public interface ISimulationState {

	long getTime();
	
	void setTime(long t);
	
	void addStateVariable(String name, Object value);
	
	Object getStateVariable(String name);
	
	void addAutoVariable(String name, IOperator operator);
	
	Iterator getIterator();
}
