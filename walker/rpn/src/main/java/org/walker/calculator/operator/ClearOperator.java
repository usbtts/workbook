package org.walker.calculator.operator;

public class ClearOperator extends AbstractOperator {

	public ClearOperator(String sign) {
		this.sign = sign;
	}
	
	@Override
	public void compute() {
		ps.clear();
	}

}
