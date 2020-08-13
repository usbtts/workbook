package org.walker.rpn.calculator;

import org.walker.rpn.operator.factory.OperatorFactory;

public class RpnCalculator extends AbstractCalculator {

	private static final OperatorFactory operatorFactory = new OperatorFactory();

	@Override
	public void compute(String inputs) {
		String[] inputsArr = inputs.split(" ");
		for (int i = 0; i < inputsArr.length; i++) {
			operatorFactory.createOperator(inputsArr[i], i).doOperate();
		}
	}
}
