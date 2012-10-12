package eu.scape_project.simulator.core;

import java.util.PriorityQueue;

import eu.scape_project.simulator.event.CreateFormat;
import eu.scape_project.simulator.event.Event;

public class EventProcesor {

	private Network network;
	private Observer observer;

	private PriorityQueue<Event> events;

	public EventProcesor() {
		events = new PriorityQueue<Event>();
	}

	public void simulate() {

		int counter = 0;

		while (true) {

			if (events.size() != 0) {
				while (events.element().getRun() == counter) {
					Event tmp = events.poll();
					tmp.setNetwork(network);
					tmp.setEventProcesor(this);
					tmp.execute();
					if (events.size()==0){
						break;
					}
				}
			}

			observer.observe(network,counter);
			
			// System.out.println("Month " + counter);
			counter++;

			// new format will be created
			if (Math.random() < 0.18) {
				CreateFormat ev = new CreateFormat();
				ev.setRun(counter);
				events.add(ev);
			}
			if (counter>1200) {
				System.out.println("End of simulation");
				break;
			}
		}

	}
	
	public void setObserver(Observer observer){
		this.observer=observer;
	}

	public void addEvent(Event event) {

		events.add(event);

	}

	public void setNetwork(Network n) {
		network = n;
	}
}
