package org.walker.rpn;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.walker.rpn.calculator.Calculator;
import org.walker.rpn.calculator.RpnCalculator;
import org.walker.rpn.event.InputListener;
import org.walker.rpn.input.CmdLineInput;
import org.walker.rpn.output.ConsoleOutput;
import org.walker.rpn.output.Output;

public class CalculatorApp {
	
	private ExecutorService service = Executors.newSingleThreadExecutor();
	
	private Calculator calculator = new RpnCalculator();
	
	private Output output = new ConsoleOutput();
	
	public static void main(String[] args) {
		new CalculatorApp().run(args);
	}

	private void run(String[] args) {
		service.execute(new CmdLineInput(new InputListener(calculator, output)));
	}
}
