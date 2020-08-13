package org.walker.rpn;

import org.junit.jupiter.api.Test;
import org.walker.rpn.calculator.RpnCalculator;

public class RpnCalculatorTest {

	private RpnCalculator rpnCalculator = new RpnCalculator();
	
	@Test
	public void testAdd() {
		rpnCalculator.calculate("1 2 3 * 5 + * * 6 5");
	}
}
