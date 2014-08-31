package eu.scape_project.pw.simulator.engine.model.state;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import eu.scape_project.pw.simulator.engine.model.state.utils.IOperator;

public class SimulationState implements ISimulationState {

	private long time;

	private Map<String, Object> stateVariables;

	private Map<String, IOperator> autoVariables;

	private Map<String, String> types;
	
	public SimulationState() {
		time = 0;
		stateVariables = new HashMap<String, Object>();
		autoVariables = new HashMap<String, IOperator>();
		types = new HashMap<String, String>();	
	}

	@Override
	public long getTime() {
		return time;
	}

	@Override
	public void setTime(long t) {
		time = t;
	}

	@Override
	public void addStateVariable(String name, Object value) {
		stateVariables.put(name, value);
	}
	
	@Override 
	public void addStateVariable(String name, Object value, String type) {
		types.put(name, type);
		addStateVariable(name,value);
	}
	
	@Override 
	public String getStateVariableType(String name) {
		return types.get(name);
	}
	
	@Override
	public void incStateVariable(String name, Double value) {
		double t = value.doubleValue();
		if (stateVariables.containsKey(name)){
			Double temp = (Double) stateVariables.get(name);
			t += temp.doubleValue();
		}
		addStateVariable(name,t);
	}

	@Override
	public void decStateVariable(String name, Double value) {
		double t = value.doubleValue();
		if (stateVariables.containsKey(name)){
			Double temp = (Double) stateVariables.get(name);
			t -= temp.doubleValue();
		}
		addStateVariable(name,t);
	}
	
	@Override
	public void multStateVariable(String name, Double value) {
		double t = value.doubleValue();
		if (stateVariables.containsKey(name)){
			Double temp = (Double) stateVariables.get(name);
			t *= temp.doubleValue();
		}
		addStateVariable(name,t);
	}

	@Override
	public Object getStateVariable(String name) {
		if (stateVariables.containsKey(name)) {
			return stateVariables.get(name);
		} else if (autoVariables.containsKey(name)) {
			return getAutoVariable(name);
		} else {
			return null;
		}
	}

	@Override
	public void addAutoVariable(String name, IOperator operator) {
		autoVariables.put(name, operator);
	}
	
	@Override 
	public void addAutoVariable(String name, IOperator operator, String type) {
		types.put(name, type);
		addAutoVariable(name,operator);
	}
	
	@Override
	public void addVariableToAutoVariable(String auto, String variable) {
		IOperator op = autoVariables.get(auto);
		op.addVariableName(variable);
	}
	
	@Override
	public void removeVariableToAutoVariable(String auto, String variable) {
		IOperator op = autoVariables.get(auto);
		op.removeVariableName(variable);
	}

	private class StateIterator implements Iterator {

		
		private Iterator stateVariableIterator;
		
		private Iterator autoVariableIterator;
		
		public StateIterator() {
			stateVariableIterator = stateVariables.entrySet().iterator();
			autoVariableIterator = autoVariables.entrySet().iterator();
		}
		
		@Override
		public boolean hasNext() {
			return (stateVariableIterator.hasNext() || autoVariableIterator.hasNext());
		}

		@Override
		public Object next() {
			if (stateVariableIterator.hasNext()) {
				return stateVariableIterator.next();
			} else if (autoVariableIterator.hasNext()){
				Map.Entry<String, IOperator> tmp = (Map.Entry<String, IOperator>) autoVariableIterator.next();
				Object obj = getAutoVariable(tmp.getValue());
				Map.Entry<String, Object> v = new AbstractMap.SimpleEntry<String, Object>(tmp.getKey(), obj);
				return v;
			}
			return null;
		}

		@Override
		public void remove() {}
		
	}
	@Override
	public Iterator getIterator() {
		return new StateIterator();
	}

	private Object getAutoVariable(String name) {
		IOperator tmp = autoVariables.get(name);
		return getAutoVariable(tmp);
	}
	
	private Object getAutoVariable(IOperator operator) {
		//Object obj = null;
		Object obj = new Double(0); //hack
		for (String n: operator.getVariableNames()) {
			if (obj == null) {
				obj = getStateVariable(n);
			}else {
				obj = operator.calculate(obj, getStateVariable(n));
			}
		}
		return obj;
	}
}
