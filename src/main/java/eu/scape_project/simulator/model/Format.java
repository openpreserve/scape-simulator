package eu.scape_project.simulator.model;

import java.util.List;

import eu.scape_project.simulator.event.CreateTool;
import eu.scape_project.simulator.event.DeleteFormat;

public class Format extends AbstractNode {

	public void init() {

		/*
		DeleteFormat df = new DeleteFormat(this);
		int lifeExpe = (int) Math.round(30 + (80 - 30) * Math.random());
		df.setRun(birth + lifeExpe);
		eventProcesor.addEvent(df);
		*/
		
		// create tools

		int numTool = (int) Math.round(2 + (6 - 2) * Math.random());
		for (int i = 0; i < numTool; i++) {
			CreateTool ct = new CreateTool(this);
			ct.setRun(birth + (int) Math.round(1 + (30 - 1) * Math.random()));
			eventProcesor.addEvent(ct);
		}
	}

	public boolean isFormat() {
		return true;
	}
	
	public int getNumberOfTools() {
		return nodes.size();
	}
}
