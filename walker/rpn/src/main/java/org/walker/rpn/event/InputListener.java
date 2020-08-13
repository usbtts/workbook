package org.walker.rpn.event;

import java.util.StringJoiner;

import org.walker.rpn.calculator.Calculator;
import org.walker.rpn.calculator.RpnCalculator;
import org.walker.rpn.exception.IllegalOperatorException;
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
		boolean exceptionThrown = false;
		int pos = 0;
		try {
			input = event.getInput().read();
			calculator.compute(input);
		} catch (IllegalOperatorException ioe) {
			output.write("operator " + ioe.getSign() + " (position: " + ioe.getPos() + "): insufficient parameters");
			exceptionThrown = true;
			pos = ioe.getPos() + 1;
		} catch (Exception e) {
			
		}
		output.write();
		
		if (exceptionThrown) {
			StringJoiner joiner = new StringJoiner(" and ");
			String[] inputsArr = input.split(" ");
			for (int i = pos; i < inputsArr.length; i++) {
				joiner.add(inputsArr[i]);
			}
			
			output.write("(" + joiner.toString() + " were not pushed on to the stack due to the previous error)");
		}
	}

}
