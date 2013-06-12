package eu.scape_project;

import java.util.Map;
import java.util.TreeMap;

public class SimulationState {

	private long time;
	
	private Map<String, IEntity> entities;
	
	public SimulationState() {
		time = 0;
		entities = new TreeMap<String, IEntity>();
	}
	
	public long getTime() {
		return time;
	}
	
	public void setTime(long t) {
		time = t;
	}
	
	public void addEntity(IEntity entity)  {
		entities.put(entity.getName(), entity);
	}
	
	public IEntity getEntity(String name) {
		return entities.get(name);
	}
}
