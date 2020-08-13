package org.walker.rpn.operator;

import java.math.BigDecimal;

public class SqrtOperator extends AbstractOperator {

	public SqrtOperator(String sign, int pos) {
		this.sign = sign;
		this.pos = pos;
	}
	
	@Override
	public void operate() {
		operandsStack.push(new BigDecimal(Math.sqrt(Double.valueOf(operandsStack.pop()))).toString());
	}

}
