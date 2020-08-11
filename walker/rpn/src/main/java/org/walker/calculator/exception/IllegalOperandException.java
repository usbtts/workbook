package org.walker.calculator.exception;

public class IllegalOperandException extends RuntimeException {

	private static final long serialVersionUID = 6821664449782257569L;

	public IllegalOperandException() {
		super();
	}
	
	public IllegalOperandException(String s) {
		super(s);
	}
	
}
