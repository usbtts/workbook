package org.walker.rpn.output;

import org.walker.rpn.stack.OperandsStack;

public abstract class AbstractOutput implements Output {
	
	public OperandsStack operandsStack = OperandsStack.getInstance();
	
	@Override
	public abstract void write();
}
