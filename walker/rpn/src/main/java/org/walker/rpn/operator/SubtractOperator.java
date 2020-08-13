package org.walker.rpn.operator;

import java.math.BigDecimal;

public class SubtractOperator extends AbstractOperator {

	public SubtractOperator(String sign, int pos) {
		this.sign = sign;
		this.pos = pos;
	}
	
	@Override
	public void operate() {
		String subtrahend = operandsStack.pop();
		String minuend = operandsStack.pop();
		operandsStack.push(new BigDecimal(minuend).subtract(new BigDecimal(subtrahend)).toString());
	}

}
