package org.walker.notebook.generics;

public class MyGenerics {

	public static void main(String[] args) {
		String v = process("v");
		String o = (String) process(new Object());
	}
	
	public static <T> T process(T val) {
		return val;
	}
	
}
