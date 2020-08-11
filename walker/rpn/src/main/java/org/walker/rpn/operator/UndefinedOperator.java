package org.walker.rpn.operator;

import org.walker.rpn.exception.UndefinedOperatorException;

public class UndefinedOperator extends AbstractOperator {

	public UndefinedOperator(String sign) {
		this.sign = sign;
	}
	
	@Override
	public void compute() {
		throw new UndefinedOperatorException();
	}

}
