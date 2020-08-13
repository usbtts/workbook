package org.walker.rpn.event;

import org.walker.rpn.calculator.Calculator;
import org.walker.rpn.calculator.RpnCalculator;
import org.walker.rpn.output.Output;

public class InputListener extends AbstractEventListener {

	private Calculator calculator = new RpnCalculator();
	
	public InputListener(Calculator calculator, Output output) {
		this.calculator = calculator;
		this.output = output;
	}
	
	@Override
	public void onEvent(Event event) {
		String input = "";
		try {
			input = event.getInput().read();
			calculator.compute(input);
			output.write();
		} catch (Exception ex) {
			logger.debug("Compute input " + input + " fail", ex);
			output.write();
		}
	}

}
