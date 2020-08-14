package org.walker.rpn.input;

import java.util.Scanner;

import org.walker.rpn.event.AbstractEventListener;
import org.walker.rpn.event.Event;

public class CmdLineInput extends AbstractInput {

	private Scanner scanner = new Scanner(System.in);
	
	public CmdLineInput(AbstractEventListener listener) {
		this.listener = listener;
	}
	
	@Override
	public String read() {
		return scanner.nextLine();
	}

	@Override
	public void run() {
		while (scanner.hasNextLine()) {
			logger.debug("There is an input");
			listener.onEvent(new Event(this));
			listener.onComplete();
		}
	}

}
