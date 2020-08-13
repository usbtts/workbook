package org.walker.rpn.operator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.walker.rpn.stack.OperandsStack;

public abstract class AbstractOperator implements Operator {

	public Logger logger = LoggerFactory.getLogger(this.getClass());
	
	public String sign;
	
	public OperandsStack operandsStack = OperandsStack.getInstance();
	
	@Override
	public abstract void operate();

	public void doOperate() {
		if (!"undo".equals(sign)) {
			operandsStack.stash();
		}
		operate();
	}

}
