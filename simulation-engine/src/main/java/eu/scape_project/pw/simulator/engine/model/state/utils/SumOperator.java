package eu.scape_project.pw.simulator.engine.model.state.utils;

public class SumOperator extends AbstractOperator{

	@Override
	public Object calculate(Object first, Object second) {
		Double d1 = (Double) first;
		Double d2 = (Double) second;
		return d1 + d2;
	}

}
