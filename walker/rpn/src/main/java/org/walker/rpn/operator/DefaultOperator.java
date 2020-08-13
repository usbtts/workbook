package org.walker.rpn.operator;

public class DefaultOperator extends AbstractOperator {

	private String input;
	
	public DefaultOperator(String sign, String input, int pos) {
		this.sign = sign;
		this.input = input;
		this.pos = pos;
	}
	
	@Override
	public void operate() {
		operandsStack.push(input);
	}

}
