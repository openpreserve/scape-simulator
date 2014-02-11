package eu.scape_project.pw.simulator.engine.model;

import eu.scape_project.pw.simulator.engine.model.state.ISimulationState;

public interface ICondition {

	IEvent checkCondition(ISimulationState state);
	
}
