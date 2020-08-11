package org.walker.calculator.operator;

public class UndoOperator extends AbstractOperator {

	public UndoOperator(String sign) {
		this.sign = sign;
	}
	
	@Override
	public void compute() {
		ps.pop();
	}

}
