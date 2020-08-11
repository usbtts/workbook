package org.walker.calculator.operator;

import java.math.BigDecimal;

public class SqrtOperator extends AbstractOperator {

	public SqrtOperator(String sign) {
		this.sign = sign;
	}
	
	@Override
	public void compute() {
		ps.push(new BigDecimal(Math.sqrt(Double.valueOf(ps.pop()))).toString());
	}

}
