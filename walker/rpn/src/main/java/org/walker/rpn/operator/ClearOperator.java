package org.walker.rpn.operator;

public class ClearOperator extends AbstractOperator {

	public ClearOperator(String sign) {
		this.sign = sign;
	}
	
	@Override
	public void operate() {
		ps.clear();
	}

}
