package org.walker.rpn;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.junit.jupiter.api.Test;
import org.walker.rpn.calculator.AbstractCalculator;
import org.walker.rpn.calculator.RpnCalculator;
import org.walker.rpn.event.InputListener;
import org.walker.rpn.input.CmdLineInput;
import org.walker.rpn.output.AbstractOutput;
import org.walker.rpn.output.ConsoleOutput;

public class RpnCalculatorTest {
	
	private ExecutorService service = Executors.newSingleThreadExecutor();
	
	private AbstractCalculator calculator = new RpnCalculator();
	
	
	@Test
	public void test() throws FileNotFoundException {
		System.setIn(new FileInputStream(this.getClass().getClassLoader().getResource("testCase.txt").getFile()));
		System.setOut(new PrintStream(this.getClass().getClassLoader().getResource("testResult.txt").getFile()));
		AbstractOutput output = new ConsoleOutput();
		service.execute(new CmdLineInput(new InputListener(calculator, output)));
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
