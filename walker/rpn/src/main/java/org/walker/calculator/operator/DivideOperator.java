package org.walker.calculator.operator;

import java.math.BigDecimal;

public class DivideOperator extends AbstractOperator {

	public DivideOperator(String sign) {
		this.sign = sign;
	}
	
	@Override
	public void compute() {
		String divisor = ps.pop();
		String dividend = ps.pop();
		ps.push(new BigDecimal(dividend).divide(new BigDecimal(divisor)).toString());
	}

}
