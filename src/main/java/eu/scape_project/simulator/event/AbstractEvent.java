package eu.scape_project.simulator.event;

import eu.scape_project.simulator.core.EventProcesor;
import eu.scape_project.simulator.core.Network;

public abstract class AbstractEvent implements Event {

	protected int run;
	
	protected Network network;
	
	protected EventProcesor eventProcesor;
	
	public void execute() {
		
		System.out.println("This is from AbstractEvent");

	}

	public int getRun() {
		return run;
	}

	public void setRun(int r) {
		run = r;
	}
	
	public void setNetwork(Network n) {
		network = n;
	}
	
	public void setEventProcesor(EventProcesor ep) {
		eventProcesor = ep;
	}
	
	
	public int compareTo(Object o) {
		Event e = (Event)o;
		if (e.getRun()<run) {
			return 1;
		}
		if (e.getRun()>run) {
			return -1;
		}
		return 0;
	}
}
