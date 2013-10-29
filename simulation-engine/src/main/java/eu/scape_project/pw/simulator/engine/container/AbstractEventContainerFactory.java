package eu.scape_project.pw.simulator.engine.container;

public abstract class AbstractEventContainerFactory implements
		IEventContainerFactory {
	
	protected IEventContainer eventContainer;
	
	@Override
	public IEventContainer getEventContainer(){
		eventContainer = new EventContainer();
		initialize();
		return eventContainer;
	}

	protected abstract void initialize();
}
