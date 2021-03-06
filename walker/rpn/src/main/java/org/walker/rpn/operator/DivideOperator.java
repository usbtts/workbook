package org.walker.rpn.operator;

import java.math.BigDecimal;

public class DivideOperator extends AbstractOperator {

	public DivideOperator(String sign, int pos) {
		this.sign = sign;
		this.pos = pos;
	}
	
	@Override
	public void operate() {
		String divisor = operandsStack.pop();
		String dividend = operandsStack.pop();
		operandsStack.push(new BigDecimal(dividend).divide(new BigDecimal(divisor)).toString());
	}

}
