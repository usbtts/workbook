package org.walker.rpn.calculator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class AbstractCalculator implements Calculator {

	public Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Override
	public abstract void compute(String inputs);

}
