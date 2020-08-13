package org.walker.rpn.event;

import org.walker.rpn.calculator.Calculator;
import org.walker.rpn.calculator.RpnCalculator;
import org.walker.rpn.output.AbstractOutput;

public class InputListener extends AbstractEventListener {

	private Calculator calculator = new RpnCalculator();
	
	public InputListener(Calculator calculator, AbstractOutput output) {
		this.calculator = calculator;
		this.output = output;
	}
	
	@Override
	public void onEvent(Event event) {
		String input = "";
		try {
			input = event.getInput().read();
			calculator.compute(input);
		} catch (Exception ex) {
			output.write("operator " + input + ": insufficient parameters");
			
		}
		output.write();
	}

}
