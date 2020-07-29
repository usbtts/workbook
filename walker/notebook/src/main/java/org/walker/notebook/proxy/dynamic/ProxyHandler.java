package org.walker.notebook.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ProxyHandler implements InvocationHandler {

	private Object target;
	
	public ProxyHandler(Object target) {
		this.target = target;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("Before invoking target.");
		method.invoke(target, args);
		System.out.println("After invoking target.");
		return null;
	}

}
