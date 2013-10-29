package eu.scape_project.pw.simulator.engine.container;

public abstract class AbstractEventObserverContainerFactory implements
		IEventObserverContainerFactory {

	protected IEventObserverContainer eOContainer;
	
	@Override
	public IEventObserverContainer getEventObserverContainer() {
		eOContainer = new EventObserverContainer();
		initialize();
		return eOContainer;
	}
	
	protected abstract void initialize();

}
