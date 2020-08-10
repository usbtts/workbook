package org.walker.notebook.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Test;

public class FlatMapTest {
	@Test
	public void testFlatMap() {
		String[] words = new String[]{"Returns", "a", "stream", "consisting", "of", "the", "results", "of", "replacing", "each", "element", "of", "this", "stream", "with", "the", "contents", "of", "a", "mapped", "stream", "produced", "by", "applying", "the", "provided", "mapping", "function", "to", "each", "element.", "", "Each", "mapped", "stream", "is", "{@link", "java.util.stream.BaseStream#close()", "closed}", "after", "its", "contents", "have", "been", "placed", "into", "this", "stream.", "", "(If", "a", "mapped", "stream", "is", "{@code", "null}", "an", "empty", "stream", "is", "used,", "instead.)"};
		List<String> flatMap = Arrays.stream(words)
		.map(word -> word.split(""))
		.flatMap(Arrays::stream)
		.distinct()
		.map(e -> e + "-")
		.collect(Collectors.toList());
		 
		flatMap.forEach(System.out::print);
		
		List<String> map = Arrays.stream(words)
		.distinct()
		.collect(Collectors.toList());
				 
		map.stream().forEach(System.out::println);
	}
}
