package org.walker.rpn.operator;

public class UndoOperator extends AbstractOperator {

	public UndoOperator(String sign) {
		this.sign = sign;
	}
	
	@Override
	public void operate() {
		ps.pop();
	}

}
