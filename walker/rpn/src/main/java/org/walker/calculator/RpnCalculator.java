package org.walker.calculator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.walker.calculator.input.Input;
import org.walker.calculator.operator.factory.OperatorFactory;
import org.walker.calculator.output.Output;

public class RpnCalculator<I, O> {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	private static final OperatorFactory operatorFactory = new OperatorFactory();

	private Input<I> input;
	
	private Output output;
	
	public void calculate() {
//		logger.info("Inputs {}", inputs);
		
		String inputs = (String) input.read();
		for (String input : inputs.split(" ")) {
			operatorFactory.createOperator(input).compute();
		}
		
		output.write();
	}
}
