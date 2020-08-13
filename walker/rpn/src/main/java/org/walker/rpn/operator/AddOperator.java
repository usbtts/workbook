package org.walker.rpn.operator;

import java.math.BigDecimal;

public class AddOperator extends AbstractOperator {

	public AddOperator(String sign) {
		this.sign = sign;
	}
	
	@Override
	public void operate() {
		String addend = operandsStack.pop();
		String augend = operandsStack.pop();
		operandsStack.push(new BigDecimal(augend).add(new BigDecimal(addend)).toString());
	}

}
