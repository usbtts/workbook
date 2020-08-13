package org.walker.rpn.input;

import org.walker.rpn.event.EventListener;

public abstract class AbstractInput implements Input, Runnable {

	public EventListener listener;
	
	@Override
	public abstract String read();

	@Override
	public abstract void run();

}
