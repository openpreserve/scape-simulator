package eu.scape_project.simulator.model;

import eu.scape_project.simulator.event.CreateTool;
import eu.scape_project.simulator.event.DeleteFormat;

public class Format extends AbstractNode{
	
	public void init() {
		System.out.println("initializing");
		/*CreateTool ev = new CreateTool(this);
		ev.setRun()*/
		
		DeleteFormat df = new DeleteFormat(this);
		df.setRun(birth+80);
		eventProcesor.addEvent(df);
		
	}

}
