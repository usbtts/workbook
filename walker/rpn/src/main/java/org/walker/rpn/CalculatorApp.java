package org.walker.rpn;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.walker.rpn.calculator.AbstractCalculator;
import org.walker.rpn.calculator.RpnCalculator;
import org.walker.rpn.event.InputListener;
import org.walker.rpn.input.CmdLineInput;
import org.walker.rpn.output.AbstractOutput;
import org.walker.rpn.output.ConsoleOutput;

public class CalculatorApp {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	private ExecutorService service = Executors.newSingleThreadExecutor();
	
	private AbstractCalculator calculator = new RpnCalculator();
	
	private AbstractOutput output = new ConsoleOutput();
	
	public static void main(String[] args) {
		new CalculatorApp().run(args);
	}

	private void run(String[] args) {
		logger.info(this.getClass().getName() + " is started...");
		service.execute(new CmdLineInput(new InputListener(calculator, output)));
	}
}
