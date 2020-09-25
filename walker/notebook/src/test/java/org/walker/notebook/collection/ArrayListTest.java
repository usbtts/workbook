package org.walker.notebook.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class ArrayListTest {

	@Test
	public void testRemoval() {
		List<String> list = Arrays.asList("1 2 3 4 5".split(" "));
		for (String ele : list) {
//			list.remove(ele);
		}
		
		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("1");
		arrayList.add("2");
		arrayList.add("3");
		arrayList.add("4");
		arrayList.add("5");
		
		for (String ele : arrayList) {
			arrayList.remove(ele);
		}
	}
}
