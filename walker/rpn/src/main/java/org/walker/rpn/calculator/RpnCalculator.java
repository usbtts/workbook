package org.walker.rpn.calculator;

import org.walker.rpn.operator.factory.OperatorFactory;

public class RpnCalculator extends AbstractCalculator {

	private static final OperatorFactory operatorFactory = new OperatorFactory();

	@Override
	public void compute(String expressions) {
		logger.debug("Expressions from input {}", expressions);
		String[] exprs = expressions.split(" ");
		for (int i = 0; i < exprs.length; i++) {
			operatorFactory.createOperator(exprs[i], i).doOperate();
		}
	}
}
