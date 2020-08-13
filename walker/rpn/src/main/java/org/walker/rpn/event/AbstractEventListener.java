package org.walker.rpn.event;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.walker.rpn.output.AbstractOutput;

public abstract class AbstractEventListener implements EventListener {

	public Logger logger = LoggerFactory.getLogger(this.getClass());
	
	public AbstractOutput output;
	
	@Override
	public abstract void onEvent(Event e);

}
