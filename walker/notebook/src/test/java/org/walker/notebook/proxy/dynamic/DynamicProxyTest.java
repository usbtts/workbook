package org.walker.notebook.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

import org.junit.jupiter.api.Test;
import org.walker.notebook.proxy.ITarget;
import org.walker.notebook.proxy.Target;
import org.walker.notebook.proxy.dynamic.ProxyHandler;

public class DynamicProxyTest {
	@Test
	public void testProxy() {
		System.getProperties().setProperty("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
		ITarget target = new Target();
		InvocationHandler handler = new ProxyHandler(target);
		ITarget targetProxy = (ITarget) Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), handler);
		targetProxy.doSomething();
	}
}
