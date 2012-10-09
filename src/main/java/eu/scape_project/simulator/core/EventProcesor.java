package eu.scape_project.simulator.core;

import java.util.PriorityQueue;

import eu.scape_project.simulator.event.CreateFormat;
import eu.scape_project.simulator.event.Event;

public class EventProcesor {

	Network network; 
	
	private PriorityQueue<Event> events;
	
	
	public EventProcesor() {
		events = new PriorityQueue<Event>();
	}
	
	
	public void simulate() {
		
		int counter  = 0;
		
		while(true) {
			
			while(events.element().getRun()==counter) {
				Event tmp = events.poll();
				tmp.setNetwork(network);
				tmp.setEventProcesor(this);
				tmp.execute();
			}
			
			//System.out.println("Month " + counter);
			counter++;
			
			if (Math.random()<0.05) {
				//System.out.println("Now");
				CreateFormat ev = new CreateFormat();
				ev.setRun(counter);
				events.add(ev);
			}
			if (events.size()==0){
				break;
			}
			
		}
		
	}
	
	public void addEvent(Event event) {
		
		events.add(event);
		
	}
	
	public void setNetwork(Network n){
		network = n;
	}
}
