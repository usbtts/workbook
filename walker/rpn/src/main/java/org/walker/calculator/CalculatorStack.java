package org.walker.calculator;

import java.util.Arrays;
import java.util.Stack;

public class CalculatorStack {
	
	private static Stack<String> parameters = new Stack<String>();
	
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
		return parameters.pop();
	}
	
	public void push(String item) {
		parameters.push(item);
	}
	
	public void clear() {
		parameters.clear();
	}
	
	public static String display() {
		return Arrays.toString(parameters.toArray());
	}
}
