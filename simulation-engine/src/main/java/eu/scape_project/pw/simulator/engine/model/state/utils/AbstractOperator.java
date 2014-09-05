package eu.scape_project.pw.simulator.engine.model.state.utils;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractOperator implements IOperator {

	private List<String> references;

	public AbstractOperator() {
		references = new ArrayList<String>();
	}

	@Override
	public List<String> getVariableNames() {
		return references;
	}

	@Override
	public void addVariableName(String name) {
		if (!contains(name)) {
			System.out.println("Adding "+name);
			references.add(name);
		}else {
			System.out.println("name already added " +name);
		}
	}

	@Override
	public void removeVariableName(String name) {
		for (String r : references) {
			if (r.compareTo(name) == 0) {
				references.remove(r);
				break;
			}
		}
	}

	private boolean contains(String name) {
		for (String r : references) {
			if (r.compareTo(name) == 0)
				return true;
		}
		return false;
	}

}
