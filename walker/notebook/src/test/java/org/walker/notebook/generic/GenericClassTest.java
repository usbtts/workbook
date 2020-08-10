package org.walker.notebook.generic;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class GenericClassTest<K, V> {
	@Test
	public void testGeneric() {
		List<?> list = new ArrayList<>();
	}
	
	private Node<K, V>[] buckets = new Node[10];
	class Node<K, V> {
		
	}
	
}
