package eu.scape_project.simulator.event;

import eu.scape_project.simulator.core.EventProcesor;
import eu.scape_project.simulator.core.Network;

public interface Event extends Comparable{

	void execute();
	
	int getRun();
	
	void setRun(int r);
	
	void setNetwork(Network network);
	
	void setEventProcesor(EventProcesor ep);
	
}
