package org.walker.rpn.operator;

public class UndoOperator extends AbstractOperator {

	public UndoOperator(String sign, int pos) {
		this.sign = sign;
		this.pos = pos;
	}
	
	@Override
	public void operate() {
		operandsStack.undo();
	}

}
