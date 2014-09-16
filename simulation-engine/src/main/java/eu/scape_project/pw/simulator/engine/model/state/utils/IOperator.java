package eu.scape_project.pw.simulator.engine.model.state.utils;

import java.util.List;

public interface IOperator {
	
	Object calculate(Object first, Object second);
	
	List<String> getVariableNames(); 
	
	void addVariableName(String name);
	
	void removeVariableName(String name);

}
