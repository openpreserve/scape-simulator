package eu.scape_project.simulator.model;

import org.apache.commons.math.MathException;
import org.apache.commons.math.distribution.NormalDistributionImpl;

import eu.scape_project.simulator.event.DeleteTool;

public class Tool extends AbstractNode{

	public Tool() {
		super();
	}
	
	public void init() {
		//System.out.println("initializing");
		DeleteTool dt = new DeleteTool(this);
		NormalDistributionImpl d = new NormalDistributionImpl(100,24);
		int lifeExpe=40;
		try {
			lifeExpe = (int)Math.round(d.sample());
		} catch (MathException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//System.out.println(lifeExpe);
		dt.setRun(birth+lifeExpe);
		eventProcesor.addEvent(dt);
		
	}

	public boolean isFormat() {
		return false;
	}
}
