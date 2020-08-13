package org.walker.rpn.event;

import org.walker.rpn.input.Input;

public class Event {
	private Input input;
	
	public Event(Input input) {
		this.input = input;
	}

	public Input getInput() {
		return input;
	}

	public void setInput(Input input) {
		this.input = input;
	}
}
