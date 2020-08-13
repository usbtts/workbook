package org.walker.rpn.output;

import java.io.PrintStream;
import java.math.BigDecimal;
import java.text.DecimalFormat;

public class ConsoleOutput extends AbstractOutput {

	private PrintStream out = System.out;
	
	private int scale = 10;
	
	private String pattern  = "#.##########";

	@Override
	public void write() {
		out.print("stack:");
		for (String operand : operandsStack.getOperands()) {
			DecimalFormat format = new DecimalFormat(pattern);
			operand = format.format(new BigDecimal(operand).setScale(scale, BigDecimal.ROUND_DOWN).doubleValue());
			out.print(operand + " ");
		}
		out.println();
	}

	public void write(String x) {
		out.println(x);
	}

}
