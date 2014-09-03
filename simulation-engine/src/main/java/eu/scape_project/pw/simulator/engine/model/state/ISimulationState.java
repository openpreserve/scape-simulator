package eu.scape_project.pw.simulator.engine.model.state;

import java.util.Iterator;

import eu.scape_project.pw.simulator.engine.model.state.utils.IOperator;

public interface ISimulationState {

	long getTime();
	
	void setTime(long t);
	
	void addStateVariable(String name, Object value);

	void addStateVariable(String name, Object value, String type);
	
	void incStateVariable(String name, Double value, String type);
	
	void decStateVariable(String name, Double Value);
	
	void multStateVariable(String name, Double value);
	
	Object getStateVariable(String name);
	
	String getStateVariableType(String name);
	
	void addAutoVariable(String name, IOperator operator);
	
	void addAutoVariable(String name, IOperator operator, String type);
	
	void addVariableToAutoVariable(String auto, String variable);
	
	void removeVariableToAutoVariable(String auto, String variable);
	
	Iterator getIterator();
}
