package org.walker.rpn;

import static org.junit.Assert.assertEquals;

import java.util.Stack;

import org.junit.jupiter.api.Test;
import org.walker.rpn.calculator.AbstractCalculator;
import org.walker.rpn.calculator.RpnCalculator;
import org.walker.rpn.stack.OperandsStack;

public class RpnCalculatorTest {
	
	private AbstractCalculator cal = new RpnCalculator();
	
	@Test
	public void testExample1() {
		Stack<String> expectedOperands = new Stack<String>();
		cal.compute("5 2");
		expectedOperands.add("5");
		expectedOperands.add("2");
		assertEquals(expectedOperands, OperandsStack.getInstance().getOperands());
	}
	
	@Test
	public void testExample2() {
		Stack<String> operands = new Stack<String>();
		cal.compute("2 sqrt");
		operands.add("1.4142135623730951454746218587388284504413604736328125");
		assertEquals(operands, OperandsStack.getInstance().getOperands());
		cal.compute("clear 9 sqrt");
		operands.clear();
		operands.add("3");
		assertEquals(operands, OperandsStack.getInstance().getOperands());
	}
}
