package eu.scape_project.simulator.model;

import org.apache.commons.math.MathException;
import org.apache.commons.math.distribution.NormalDistribution;
import org.apache.commons.math.distribution.NormalDistributionImpl;

import eu.scape_project.simulator.event.CreateTool;

public class Format extends AbstractNode {

	public void init() {

		/*
		DeleteFormat df = new DeleteFormat(this);
		int lifeExpe = (int) Math.round(30 + (80 - 30) * Math.random());
		df.setRun(birth + lifeExpe);
		eventProcesor.addEvent(df);
		*/
		
		// create tools

		//int numTool = (int) Math.round(2 + (10 - 2) * Math.random());
		NormalDistributionImpl d = new NormalDistributionImpl(7,2);
		long numTool=0;
		try {
			numTool = Math.round(d.sample());
		} catch (MathException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		d = new NormalDistributionImpl(18, 6);
		for (int i = 0; i < numTool; i++) {
			CreateTool ct = new CreateTool(this);
			try {
				ct.setRun(birth + (int) Math.round(d.sample()));
			} catch (MathException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
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
