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

	public SimulationState() {
		time = 0;
		stateVariables = new HashMap<String, Object>();
		autoVariables = new HashMap<String, IOperator>();
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
		Object obj = null;
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
