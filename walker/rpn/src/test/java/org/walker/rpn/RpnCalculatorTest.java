package org.walker.rpn;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.Arrays;
import java.util.Stack;

import org.junit.jupiter.api.Test;
import org.walker.rpn.calculator.AbstractCalculator;
import org.walker.rpn.calculator.RpnCalculator;
import org.walker.rpn.exception.IllegalOperatorException;
import org.walker.rpn.stack.OperandsStack;

public class RpnCalculatorTest {
	
	private AbstractCalculator cal = new RpnCalculator();
	private OperandsStack operandsStack = OperandsStack.getInstance();
	
	@Test
	public void testExample1() {
		Stack<String> operands = new Stack<String>();
		cal.compute("5 2");
		operands.add("5");
		operands.add("2");
		assertEquals(operands, operandsStack.getOperands());
		operandsStack.getOperands().clear();
	}
	
	@Test
	public void testExample2() {
		Stack<String> operands = new Stack<String>();
		cal.compute("2 sqrt");
		operands.add("1.4142135623730951454746218587388284504413604736328125");
		assertEquals(operands, operandsStack.getOperands());
		operands.clear();
		
		cal.compute("clear 9 sqrt");
		operands.add("3");
		assertEquals(operands, operandsStack.getOperands());
		operandsStack.getOperands().clear();
	}
	
	@Test
	public void testExample3() {
		Stack<String> operands = new Stack<String>();
		cal.compute("5 2 -");
		operands.add("3");
		assertEquals(operands, operandsStack.getOperands());
		operands.clear();
		
		cal.compute("3 -");
		operands.add("0");
		assertEquals(operands, operandsStack.getOperands());
		operands.clear();
		
		cal.compute("clear");
		assertEquals(operands, operandsStack.getOperands());
		operandsStack.getOperands().clear();
	}
	
	@Test
	public void testExample4() {
		Stack<String> operands = new Stack<String>();
		cal.compute("5 4 3 2");
		operands.addAll(Arrays.asList("5 4 3 2".split(" ")));
		assertEquals(operands, operandsStack.getOperands());
		operands.clear();
		
		cal.compute("undo undo *");
		operands.add("20");
		assertEquals(operands, operandsStack.getOperands());
		operands.clear();
		
		cal.compute("5 *");
		operands.add("100");
		assertEquals(operands, operandsStack.getOperands());
		operands.clear();
		
		cal.compute("undo");
		operands.addAll(Arrays.asList("20 5".split(" ")));
		assertEquals(operands, operandsStack.getOperands());
		operandsStack.getOperands().clear();
	}
	
	@Test
	public void testExample5() {
		Stack<String> operands = new Stack<String>();
		cal.compute("7 12 2 /");
		operands.addAll(Arrays.asList("7 6".split(" ")));
		assertEquals(operands, operandsStack.getOperands());
		operands.clear();
		
		cal.compute("*");
		operands.add("42");
		assertEquals(operands, operandsStack.getOperands());
		operands.clear();
		
		cal.compute("4 /");
		operands.add("10.5");
		assertEquals(operands, operandsStack.getOperands());
		operandsStack.getOperands().clear();
	}
	
	@Test
	public void testExample6() {
		Stack<String> operands = new Stack<String>();
		cal.compute("1 2 3 4 5");
		operands.addAll(Arrays.asList("1 2 3 4 5".split(" ")));
		assertEquals(operands, operandsStack.getOperands());
		operands.clear();
		
		cal.compute("*");
		operands.addAll(Arrays.asList("1 2 3 20".split(" ")));
		assertEquals(operands, operandsStack.getOperands());
		operands.clear();
		
		cal.compute("clear 3 4 -");
		operands.add("-1");
		assertEquals(operands, operandsStack.getOperands());
		operandsStack.getOperands().clear();
	}
	
	@Test
	public void testExample7() {
		Stack<String> operands = new Stack<String>();
		cal.compute("1 2 3 4 5");
		operands.addAll(Arrays.asList("1 2 3 4 5".split(" ")));
		assertEquals(operands, operandsStack.getOperands());
		operands.clear();
		
		cal.compute("* * * *");
		operands.add("120");
		assertEquals(operands, operandsStack.getOperands());
		operandsStack.getOperands().clear();
	}
	
	@Test
	public void testExample8() {
		Stack<String> operands = new Stack<String>();
		IllegalOperatorException ex = assertThrows(IllegalOperatorException.class, () -> cal.compute("1 2 3 * 5 + * * 6 5"));
		assertTrue(ex.getMessage() == null);
		operands.add("11");
		assertEquals(operands, operandsStack.getOperands());
		operandsStack.getOperands().clear();
	}
}
