package eu.scape_project.pw.simulator.engine.container;

public abstract class AbstractConditionalEventContainerFactory implements
		IConditionalEventContainerFactory {

	protected IConditionalEventContainer icContainer; 
	
	public IConditionalEventContainer getConditionalEventContainer() {
		
		icContainer = new ConditionalEventContainer();
		initialize();
		return icContainer;
	}
	
	abstract protected void initialize();
}
