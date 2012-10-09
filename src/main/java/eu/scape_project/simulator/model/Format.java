package eu.scape_project.simulator.model;

import eu.scape_project.simulator.event.CreateTool;
import eu.scape_project.simulator.event.DeleteFormat;

public class Format extends AbstractNode{
	
	public void init() {
		//System.out.println("initializing");
		/*CreateTool ev = new CreateTool(this);
		ev.setRun()*/
		
		DeleteFormat df = new DeleteFormat(this);
		int lifeExpe = (int)Math.round(30 + (80-30)*Math.random());
		df.setRun(birth+lifeExpe);
		eventProcesor.addEvent(df);
		
		
		//create tools 
		
		int numTool = (int)Math.round(2 + (6-2)*Math.random());
		CreateTool ct = new CreateTool(this);
		ct.setRun(birth+1);
		eventProcesor.addEvent(ct);
		
	}

}
