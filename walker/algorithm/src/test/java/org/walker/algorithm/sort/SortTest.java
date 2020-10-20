package org.walker.algorithm.sort;

import org.assertj.core.util.Arrays;
import org.junit.jupiter.api.Test;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SortTest {

	private int[] arr = { 11, 28, 40, 68, 18, 18, 25, 64, 66, 38, 51, 73, 90, 84, 95 };

	private Sort<int[]> selectionSort = new SelectionSort();

	@Test
	public void testSelectionSort() {
		log.info(Arrays.asList(arr).toString());
		selectionSort.sort(arr);
		log.info(Arrays.asList(arr).toString());
	}
}
