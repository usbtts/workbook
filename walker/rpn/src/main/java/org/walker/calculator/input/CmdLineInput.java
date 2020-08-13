package org.walker.calculator.input;

import java.util.Scanner;

public class CmdLineInput<String> implements Input<String> {

	private Scanner scanner = new Scanner(System.in);
	
	@Override
	public String read() {
		return scanner.nextLine();
	}

}
