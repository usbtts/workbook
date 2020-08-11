package org.walker.calculator.operator;

import org.walker.calculator.exception.UndefinedOperatorException;

public class UndefinedOperator extends AbstractOperator {

	public UndefinedOperator(String sign) {
		this.sign = sign;
	}
	
	@Override
	public void compute() {
		throw new UndefinedOperatorException();
	}

}
