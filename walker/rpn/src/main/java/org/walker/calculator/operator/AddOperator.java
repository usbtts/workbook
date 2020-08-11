package org.walker.calculator.operator;

import java.math.BigDecimal;

public class AddOperator extends AbstractOperator {

	public AddOperator(String sign) {
		this.sign = sign;
	}
	
	@Override
	public void compute() {
		String addend = ps.pop();
		String augend = ps.pop();
		ps.push(new BigDecimal(augend).add(new BigDecimal(addend)).toString());
	}

}
