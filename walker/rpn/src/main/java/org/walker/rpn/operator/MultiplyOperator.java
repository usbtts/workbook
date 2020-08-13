package org.walker.rpn.operator;

import java.math.BigDecimal;

public class MultiplyOperator extends AbstractOperator {

	public MultiplyOperator(String sign, int pos) {
		this.sign = sign;
		this.pos = pos;
	}
	
	@Override
	public void operate() {
		String multiplier = operandsStack.pop();
		String multiplicand = operandsStack.pop();
		operandsStack.push(new BigDecimal(multiplicand).multiply(new BigDecimal(multiplier)).toString());
	}

}
