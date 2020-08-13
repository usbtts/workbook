package org.walker.rpn.stack;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;

import org.apache.commons.lang3.SerializationUtils;

public class OperandsStack {

	private static volatile OperandsStack instance;

	private Stack<String> operands;

	private LinkedList<Stack<String>> operandsList = new LinkedList<>();

	private OperandsStack() {
		operands = new Stack<String>();
		operandsList.addFirst(operands);
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

	public void undo() {
		if (operandsList.size() > 1) {
			operandsList.removeFirst();
			operands = operandsList.peek();
			System.out.println("undo: " + Arrays.asList(operands.toArray()));
		}
	}

	public Stack<String> getOperands() {
		return operands;
	}

	public void setOperands(Stack<String> operands) {
		this.operands = operands;
	}

	public void stash() {
		Stack<String> first = operandsList.peek();
		if (operands == null) {
			operands = new Stack<String>();
		}
		operandsList.addFirst(SerializationUtils.clone(operands));
		setOperands(operandsList.peek());
		System.out.println("stash list: " + operandsList);
	}
}
