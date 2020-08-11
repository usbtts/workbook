package org.walker.rpn.exception;

public class UndefinedOperatorException extends RuntimeException {

	private static final long serialVersionUID = 6821664449782257569L;

	public UndefinedOperatorException() {
		super();
	}
	
	public UndefinedOperatorException(String s) {
		super(s);
	}
	
}
