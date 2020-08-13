package org.walker.rpn.operator;

public class ClearOperator extends AbstractOperator {

	public ClearOperator(String sign, int pos) {
		this.sign = sign;
		this.pos = pos;
	}
	
	@Override
	public void operate() {
		operandsStack.clear();
	}

}
