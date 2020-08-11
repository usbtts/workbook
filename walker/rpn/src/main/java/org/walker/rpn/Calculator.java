package org.walker.rpn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.walker.rpn.operator.factory.OperatorFactory;

public class Calculator {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	private static final OperatorFactory operatorFactory = new OperatorFactory();

	public void calculate(String inputs) {
		logger.info("Inputs {}", inputs);
		for (String input : inputs.split(" ")) {
			operatorFactory.createOperator(input).compute();
		}
		
		logger.info("Stack: " + ParametersStack.getInstance().toString());
	}
}
