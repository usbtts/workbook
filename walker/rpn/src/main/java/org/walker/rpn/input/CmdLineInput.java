package org.walker.rpn.input;

import java.util.Scanner;

import org.walker.rpn.event.Event;
import org.walker.rpn.event.EventListener;

public class CmdLineInput extends AbstractInput {

	private Scanner scanner = new Scanner(System.in);
	
	public CmdLineInput(EventListener listener) {
		this.listener = listener;
	}
	
	@Override
	public String read() {
		return scanner.nextLine();
	}

	@Override
	public void run() {
		while (scanner.hasNextLine()) {
			listener.onEvent(new Event(this));
		}
	}

}
