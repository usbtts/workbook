package org.walker.rpn;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.walker.rpn.calculator.AbstractCalculator;
import org.walker.rpn.calculator.RpnCalculator;
import org.walker.rpn.event.InputListener;
import org.walker.rpn.input.CmdLineInput;
import org.walker.rpn.output.AbstractOutput;
import org.walker.rpn.output.ConsoleOutput;

public class CalculatorApp {
	
	private ExecutorService service = Executors.newSingleThreadExecutor();
	
	private AbstractCalculator calculator = new RpnCalculator();
	
	private AbstractOutput output = new ConsoleOutput();
	
	public static void main(String[] args) {
		new CalculatorApp().run(args);
	}

	private void run(String[] args) {
		service.execute(new CmdLineInput(new InputListener(calculator, output)));
	}
}
