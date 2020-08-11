package org.walker.rpn;

import java.util.Stack;

public class ParametersStack {
	private Stack<String> parameters = new Stack<String>();
	
	private static volatile ParametersStack instance;
	
	private ParametersStack() {
		
	}
	
	public static ParametersStack getInstance() {
		if (instance == null) {
			synchronized (ParametersStack.class) {
				instance = new ParametersStack();
			}
		}
		return instance;
	}
	
	public String pop() {
		return parameters.pop();
	}
	
	public void push(String item) {
		parameters.push(item);
	}
	
	public String display() {
		return parameters.toString();
	}
}
