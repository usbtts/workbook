package org.walker.rpn.operator;

import java.math.BigDecimal;

public class MultiplyOperator extends AbstractOperator {

	public MultiplyOperator(String sign) {
		this.sign = sign;
	}
	
	@Override
	public void operate() {
		String multiplier = operandsStack.pop();
		String multiplicand = operandsStack.pop();
		operandsStack.push(new BigDecimal(multiplicand).multiply(new BigDecimal(multiplier)).toString());
	}

}
