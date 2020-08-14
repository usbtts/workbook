package org.walker.rpn.input;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.walker.rpn.event.AbstractEventListener;

public abstract class AbstractInput implements Input, Runnable {

	public Logger logger = LoggerFactory.getLogger(this.getClass());
	
	public AbstractEventListener listener;
	
	@Override
	public abstract String read();

	@Override
	public abstract void run();

}
