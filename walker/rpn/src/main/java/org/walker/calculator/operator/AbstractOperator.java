package org.walker.calculator.operator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.walker.calculator.CalculatorStack;

public class AbstractOperator implements Operator {

	public Logger logger = LoggerFactory.getLogger(this.getClass());
	
	public String sign;
	
	public CalculatorStack ps = CalculatorStack.getInstance();
	
	@Override
	public void compute() {
	}

}
