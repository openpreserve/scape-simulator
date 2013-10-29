package eu.scape_project;

public abstract class SimulationProperties implements ISimulationProperties {
	
	protected String name = null;
	
	protected int numberOfRuns = 0;

	@Override
	public String getName() {
		return name;
	}

	@Override
	public int getNumberOfRuns() {
		return numberOfRuns;
	}

}
