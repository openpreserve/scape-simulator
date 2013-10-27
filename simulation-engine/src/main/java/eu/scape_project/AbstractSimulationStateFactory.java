package eu.scape_project;

public abstract class AbstractSimulationStateFactory implements ISimulationStateFactory {

	protected ISimulationState simulationState;
	
	public ISimulationState getSimulationState() {
		initializeState();
		return simulationState;
	}
	
	protected abstract void initializeState();
}
