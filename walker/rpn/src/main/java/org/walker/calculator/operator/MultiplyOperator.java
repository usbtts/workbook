package org.walker.calculator.operator;

import java.math.BigDecimal;

public class MultiplyOperator extends AbstractOperator {

	public MultiplyOperator(String sign) {
		this.sign = sign;
	}
	
	@Override
	public void compute() {
		String multiplier = ps.pop();
		String multiplicand = ps.pop();
		ps.push(new BigDecimal(multiplicand).multiply(new BigDecimal(multiplier)).toString());
	}

}
