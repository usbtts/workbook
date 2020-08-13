package org.walker.rpn.output;

import java.io.PrintStream;

public class ConsoleOutput extends AbstractOutput {

	private PrintStream out = System.out;
	
	@Override
	public void write() {
		out.print("stack:");
		for (String operand : operandsStack.getOperands()) {
			out.print(operand + " ");
		}
		out.println();
	}
	
	public void write(String x) {
		out.println(x);
	}

}
