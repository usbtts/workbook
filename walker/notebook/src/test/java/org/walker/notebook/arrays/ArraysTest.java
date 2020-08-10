package org.walker.notebook.arrays;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class ArraysTest {
	
	@Test
	public void testArrays() {
		ArraysTest[] c = new ArraysTest[2];
		c[0] = new ArraysTest();
		c[1] = new ArraysTest();
		int[][] a = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		
		int index = 1000 * Integer.MAX_VALUE;
		System.out.println(index);
		System.out.println(Arrays.deepToString(a));
		
		int arraySize = 10;
		int[] b = new int[arraySize];
		Arrays.fill(b, 1);
		System.out.println(Arrays.toString(b));
		System.out.println(b.getClass().getComponentType());
		System.out.println(a.getClass().getComponentType());
		Arrays.sort(c);
		System.out.println(c.getClass().getComponentType());
		System.out.println((Object)Object[].class);
	}
}
