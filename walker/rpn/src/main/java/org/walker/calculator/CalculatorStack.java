package org.walker.calculator;

import java.util.Arrays;
import java.util.Stack;

public class CalculatorStack {
	
	private static Stack<String> operands = new Stack<String>();
	
	private static volatile CalculatorStack instance;
	
	private CalculatorStack() {
		
	}
	
	public static CalculatorStack getInstance() {
		if (instance == null) {
			synchronized (CalculatorStack.class) {
				instance = new CalculatorStack();
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
	
	public static String display() {
		return Arrays.toString(operands.toArray());
	}
}
