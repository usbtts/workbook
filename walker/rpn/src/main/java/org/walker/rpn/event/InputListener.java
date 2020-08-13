package org.walker.rpn.event;

import org.walker.rpn.calculator.Calculator;
import org.walker.rpn.calculator.RpnCalculator;
import org.walker.rpn.output.Output;
import org.walker.rpn.stack.OperandsStack;

public class InputListener extends AbstractEventListener {

	private Calculator calculator = new RpnCalculator();
	
	private OperandsStack ps = OperandsStack.getInstance();
	
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
		} finally {
			
		}
	}

}
