package org.walker.rpn.operator;

import java.math.BigDecimal;

public class AddOperator extends AbstractOperator {

	public AddOperator(String sign, int pos) {
		this.sign = sign;
		this.pos = pos;
	}
	
	@Override
	public void operate() {
		String addend = operandsStack.pop();
		String augend = operandsStack.pop();
		operandsStack.push(new BigDecimal(augend).add(new BigDecimal(addend)).toString());
	}

}
