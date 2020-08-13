package org.walker.rpn.exception;

public class IllegalOperatorException extends RuntimeException {

	private static final long serialVersionUID = 6821664449782257569L;

	private String sign;
	
	private int pos;
	
	public IllegalOperatorException() {
		super();
	}
	
	public IllegalOperatorException(String s, String sign, int pos) {
		super(s);
		this.sign = sign;
		this.pos = pos;
	}

	public String getSign() {
		return sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
	}

	public int getPos() {
		return pos;
	}

	public void setPos(int pos) {
		this.pos = pos;
	}
	
}
