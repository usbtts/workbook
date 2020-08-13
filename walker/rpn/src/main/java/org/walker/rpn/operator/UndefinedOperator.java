package org.walker.rpn.operator;

import org.walker.rpn.exception.UndefinedOperatorException;

public class UndefinedOperator extends AbstractOperator {

	public UndefinedOperator(String sign, int pos) {
		this.sign = sign;
		this.pos = pos;
	}
	
	@Override
	public void operate() {
		throw new UndefinedOperatorException("Sign [" + this.sign + "] at position [" + this.pos + "] is undefined");
	}

}
