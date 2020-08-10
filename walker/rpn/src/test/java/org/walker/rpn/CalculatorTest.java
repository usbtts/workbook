package org.walker.rpn;

import org.junit.jupiter.api.Test;

public class CalculatorTest {

	private Calculator calculator = new Calculator();
	
	@Test
	public void testRpnCalculator() {
		calculator.calculate("5 2 +");
	}
}
