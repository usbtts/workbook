package org.walker.algorithm.sort;

public abstract class AbstractSort<T> implements Sort<T> {

	private double timeConsuming;
	
	@Override
	public void sort(T arr) {
		double startTime = System.nanoTime();
		doSort(arr);
		double endTime = System.nanoTime();
		this.setTimeConsuming((endTime - startTime) / 1000 / 1000);
	}
	
	public abstract void doSort(T arr);
	
	public double getTimeConsuming() {
		return timeConsuming;
	}

	private void setTimeConsuming(double timeConsuming) {
		this.timeConsuming = timeConsuming;
	}
	
}
