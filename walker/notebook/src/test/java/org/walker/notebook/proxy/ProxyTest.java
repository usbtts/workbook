package org.walker.notebook.proxy;

import org.junit.jupiter.api.Test;
import org.walker.notebook.proxy.ITarget;
import org.walker.notebook.proxy.Proxy;
import org.walker.notebook.proxy.Target;

public class ProxyTest {

	@Test
	public void testProxy() {
		ITarget targetProxy = new Proxy(new Target());
		targetProxy.doSomething();
	}
}
