package org.walker.rpn;

import java.math.BigDecimal;
import java.util.Stack;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.walker.rpn.operator.Operator;
import org.walker.rpn.operator.factory.OperatorFactory;

public class Calculator {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	private static final OperatorFactory factory = OperatorFactory.getInstance();

	private Stack<BigDecimal> parameters = new Stack<BigDecimal>();

	public void calculate(String inputs) {
		for (String input : inputs.split(" ")) {
			if (isOperator(input)) {
				Operator operator = null;
				switch (input) {
					case "+":
						BigDecimal augend = parameters.pop();
						BigDecimal addend = parameters.pop();
						operator = factory.createAddOperator(input, addend, augend);
						break;
					default:
						break;
				}

				parameters.add(operator.compute());
			}
		}
		
		System.out.println(parameters);
	}

	private boolean isOperator(String input) {
		return Operator.operators.contains(input);
	}

}
