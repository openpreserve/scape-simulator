package eu.scape_project;

import java.util.HashMap;
import java.util.Map;

public class SimulationState {

	private long time;
	
	private Map<String, Object> stateVariables;
	
	public SimulationState() {
		time = 0;
		stateVariables = new HashMap<String, Object>();
	}
	
	public long getTime() {
		return time;
	}
	
	public void setTime(long t) {
		time = t;
	}
	
	public void addStateVariable(String name, Object value)  {
		stateVariables.put(name, value);
	}
	
	public Object getStateVariable(String name) {
		return stateVariables.get(name);
	}
}
