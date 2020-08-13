package org.walker.rpn.operator;

import org.walker.rpn.exception.UndefinedOperatorException;

public class UndefinedOperator extends AbstractOperator {

	public UndefinedOperator(String sign) {
		this.sign = sign;
	}
	
	@Override
	public void operate() {
		throw new UndefinedOperatorException("Sign [" + this.sign + "] is undefined");
	}

}
