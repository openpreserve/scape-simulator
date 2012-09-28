package eu.scape_project.simulator.model;

import eu.scape_project.simulator.core.EventProcesor;

public interface Node {

	void setEventProcessor(EventProcesor ep);
	
	void init();
	
	void setBirth(int b);
	
	int getBirth();
}
