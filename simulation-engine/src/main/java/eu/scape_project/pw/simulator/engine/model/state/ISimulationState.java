package eu.scape_project.pw.simulator.engine.model.state;

import java.util.Iterator;

import eu.scape_project.pw.simulator.engine.model.state.utils.IOperator;

public interface ISimulationState {

	long getTime();
	
	void setTime(long t);
	
	void addStateVariable(String name, Object value);
	
	void incStateVariable(String name, Double value);
	
	void decStateVariable(String name, Double Value);
	
	void multStateVariable(String name, Double value);
	
	Object getStateVariable(String name);
	
	void addAutoVariable(String name, IOperator operator);
	
	void addVariableToAutoVariable(String auto, String variable);
	
	void removeVariableToAutoVariable(String auto, String variable);
	
	Iterator getIterator();
}
