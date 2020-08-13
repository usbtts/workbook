package org.walker.rpn.stack;

import java.util.Arrays;
import java.util.Stack;

public class OperandsStack {
	
	private static volatile OperandsStack instance;
	
	private Stack<String> operands;
	
	private OperandsStack() {
		 operands = new Stack<String>();
	}
	
	public static OperandsStack getInstance() {
		if (instance == null) {
			synchronized (OperandsStack.class) {
				instance = new OperandsStack();
			}
		}
		return instance;
	}
	
	public String pop() {
		return operands.pop();
	}
	
	public void push(String item) {
		operands.push(item);
	}
	
	public void clear() {
		operands.clear();
	}
	
	public Stack<String> getOperands() {
		return operands;
	}
	
	public String display() {
		return Arrays.toString(operands.toArray());
	}
}
