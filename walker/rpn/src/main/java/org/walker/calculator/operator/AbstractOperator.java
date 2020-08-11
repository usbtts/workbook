package org.walker.calculator.operator;

import org.walker.calculator.ParametersStack;

public class AbstractOperator implements Operator {

	public String sign;
	
	public ParametersStack ps = ParametersStack.getInstance();
	
	@Override
	public void compute() {
	}

	@Override
	public void compute(String item) {
		ps.push(item);
	}

}
