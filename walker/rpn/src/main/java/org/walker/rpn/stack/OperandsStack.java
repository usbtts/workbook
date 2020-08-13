package org.walker.rpn.stack;

import java.util.LinkedList;
import java.util.Stack;

import org.apache.commons.lang3.SerializationUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OperandsStack {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
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
			logger.debug("operands list: {}", operandsList);
			logger.debug("current operands: {}", operands);
		}
	}

	public Stack<String> getOperands() {
		return operands;
	}

	public void setOperands(Stack<String> operands) {
		this.operands = operands;
	}

	public void stash() {
		operandsList.addFirst(SerializationUtils.clone(operands));
		setOperands(operandsList.peek());
		logger.debug("operands list: {}", operandsList);
		logger.debug("current operands: {}", operands);
	}
}
