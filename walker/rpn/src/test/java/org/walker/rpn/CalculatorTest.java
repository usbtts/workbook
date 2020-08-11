package org.walker.rpn;

import org.junit.jupiter.api.Test;
import org.walker.calculator.Calculator;

public class CalculatorTest {

	private Calculator calculator = new Calculator();
	
	@Test
	public void testRpnCalculator() {
		calculator.calculate("5 2 +");
	}
}
