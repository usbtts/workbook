package org.walker.calculator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.walker.calculator.operator.factory.OperatorFactory;

public class RpnCalculator {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	private static final OperatorFactory operatorFactory = new OperatorFactory();

	public void calculate(String inputs) {
//		logger.info("Inputs {}", inputs);
		for (String input : inputs.split(" ")) {
			operatorFactory.createOperator(input).compute();
		}
		
		logger.info("Stack: {}", CalculatorStack.display());
	}
}
