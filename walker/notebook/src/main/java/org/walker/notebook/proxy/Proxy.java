package org.walker.notebook.proxy;

public class Proxy implements ITarget {
	
	private ITarget target;
	
	public Proxy(ITarget target) {
		this.target = target;
	}
	
	@Override
	public void doSomething() {
		System.out.println("Before invoking target.");
		target.doSomething();
		System.out.println("After invoking target.");
	}

}
