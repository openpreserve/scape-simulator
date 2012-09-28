package eu.scape_project.simulator.model;

import eu.scape_project.simulator.core.EventProcesor;

public abstract class AbstractNode implements Node {

	protected int birth; 
	
	
	protected EventProcesor eventProcesor;
	
	public void setEventProcessor(EventProcesor ep) {
		eventProcesor = ep;
	}

	public void setBirth(int b) {
		birth = b;
	}
	
	public int getBirth() {
		return birth;
	}
}
