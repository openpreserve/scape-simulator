package eu.scape_project.simulator.model;

import eu.scape_project.simulator.event.DeleteTool;

public class Tool extends AbstractNode{

	public void init() {
		System.out.println("initializing");
		DeleteTool dt = new DeleteTool(this);
		int lifeExpe = (int)Math.round(20 + (30-20)*Math.random());
		System.out.println(lifeExpe);
		dt.setRun(birth+lifeExpe);
		eventProcesor.addEvent(dt);
		
	}
}
