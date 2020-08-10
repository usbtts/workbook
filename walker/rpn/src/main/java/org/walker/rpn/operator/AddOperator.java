package org.walker.rpn.operator;

import java.math.BigDecimal;

public class AddOperator implements Operator {

	private String sign;
	private BigDecimal addend;
	private BigDecimal augend;
	
	public AddOperator(String sign, BigDecimal addend, BigDecimal augend) {
		this.sign = sign;
		this.addend = addend;
		this.augend = augend;
	}
	
	@Override
	public BigDecimal compute() {
		return addend.add(augend);
	}

	public String getSign() {
		return sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
	}

	public BigDecimal getAddend() {
		return addend;
	}

	public void setAddend(BigDecimal addend) {
		this.addend = addend;
	}

	public BigDecimal getAugend() {
		return augend;
	}

	public void setAugend(BigDecimal augend) {
		this.augend = augend;
	}

}
