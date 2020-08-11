package org.walker.rpn.operator;

import java.math.BigDecimal;

import org.walker.rpn.exception.IllegalOperandException;

public class AddOperator extends AbstractOperator {

	public AddOperator(String sign) {
		this.sign = sign;
	}
	
	@Override
	public void compute() {
		String augend = ps.pop();
		if (augend == null) {
			throw new IllegalOperandException("augend is null");
		}
		
		String addend = ps.pop();
		if (addend == null) {
			throw new IllegalOperandException("addend is null");
		}
		
		try {
			ps.push(new BigDecimal(addend).add(new BigDecimal(augend)).toString());
		} catch (NumberFormatException e) {
			throw new IllegalOperandException("illegal operand " + addend + ", " + augend);
		}
	}

}
