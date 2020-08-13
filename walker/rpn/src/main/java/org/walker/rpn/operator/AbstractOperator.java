package org.walker.rpn.operator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.walker.rpn.stack.OperandsStack;

public class AbstractOperator implements Operator {

	public Logger logger = LoggerFactory.getLogger(this.getClass());
	
	public String sign;
	
	public OperandsStack ps = OperandsStack.getInstance();
	
	@Override
	public void operate() {
	}

}
