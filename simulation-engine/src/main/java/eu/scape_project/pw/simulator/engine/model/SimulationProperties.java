package eu.scape_project.pw.simulator.engine.model;


public abstract class SimulationProperties implements ISimulationProperties {
	
	protected String name = null;
	
	protected int numberOfRuns = 0;
	
	protected long endTime = 0;

	@Override
	public String getName() {
		return name;
	}

	@Override
	public int getNumberOfRuns() {
		return numberOfRuns;
	}
	
	@Override 
	public long getEndTime() {
		return endTime;
	}

}
