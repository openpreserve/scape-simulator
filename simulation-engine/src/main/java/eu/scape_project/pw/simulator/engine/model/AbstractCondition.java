package eu.scape_project.pw.simulator.engine.model;

import eu.scape_project.pw.simulator.engine.model.state.ISimulationState;

public abstract class AbstractCondition implements ICondition{

	public IEvent checkCondition(ISimulationState state){
		if (check(state))  {
			return getEvent(state.getTime());
		}
		return null;
	}
	
	protected abstract boolean check(ISimulationState state);
	
	protected abstract IEvent getEvent(long time); 
}
