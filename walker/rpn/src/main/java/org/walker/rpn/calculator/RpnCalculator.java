package org.walker.rpn.calculator;

import org.walker.rpn.operator.factory.OperatorFactory;

public class RpnCalculator implements Calculator {

	private static final OperatorFactory operatorFactory = new OperatorFactory();

	@Override
	public void compute(String inputs) {
		for (String input : inputs.split(" ")) {
			operatorFactory.createOperator(input).doOperate();
		}
	}
}
