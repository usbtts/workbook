package org.walker.rpn.operator;

import org.walker.rpn.ParametersStack;

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
