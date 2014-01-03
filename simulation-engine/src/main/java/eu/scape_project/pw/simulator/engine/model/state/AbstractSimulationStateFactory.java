package eu.scape_project.pw.simulator.engine.model.state;


public abstract class AbstractSimulationStateFactory implements ISimulationStateFactory {

	protected ISimulationState state;
	
	public ISimulationState getSimulationState() {
		state = new SimulationState();
		initialize();
		return state;
	}
	
	protected abstract void initialize();
}
