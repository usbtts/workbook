package org.walker.rpn.base;

import java.math.BigDecimal;

public class OperateResult {
	private String message;
	private BigDecimal result;
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public BigDecimal getResult() {
		return result;
	}
	public void setResult(BigDecimal result) {
		this.result = result;
	}
}
