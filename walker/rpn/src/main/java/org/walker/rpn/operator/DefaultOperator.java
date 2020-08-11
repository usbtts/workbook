package org.walker.rpn.operator;

public class DefaultOperator extends AbstractOperator {

	private String input;
	
	public DefaultOperator(String sign, String input) {
		this.sign = sign;
		this.input = input;
	}
	
	@Override
	public void compute() {
		ps.push(input);
	}

}
