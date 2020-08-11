package org.walker.calculator.operator;

import java.math.BigDecimal;

public class SubtractOperator extends AbstractOperator {

	public SubtractOperator(String sign) {
		this.sign = sign;
	}
	
	@Override
	public void compute() {
		String subtrahend = ps.pop();
		String augend = ps.pop();
		ps.push(new BigDecimal(augend).subtract(new BigDecimal(subtrahend)).toString());
	}

}
