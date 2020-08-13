package org.walker.notebook.thread;

import java.util.concurrent.LinkedBlockingQueue;

public class ThreadOrder {
	
	private LinkedBlockingQueue<Integer> inputQueue = new LinkedBlockingQueue<>(2);
	private LinkedBlockingQueue<Integer> outputQueue = new LinkedBlockingQueue<>(2);
	
	public static void main(String[] args) {
		new ThreadOrder().run();
	}
	
	private void run() {
		boolean isDisorder = false;
		while (!isDisorder) {
			inputQueue.add(1);
			inputQueue.add(2);
			PlainThread pt1 = new PlainThread();
			PlainThread pt2 = new PlainThread();
			pt1.start();
			pt2.start();
			while (outputQueue.size() != 2) {
			}
			/*
			 * if (outputQueue.poll() == 2) { isDisorder = true; }
			 */
			System.out.println(outputQueue);
			outputQueue.clear();
		}
	}

	private class PlainThread extends Thread {

		private int counter = 0;
		
		@Override
		public void run() {
			counter++;
			try {
				Integer e = inputQueue.take();
				System.out.println(Thread.currentThread().getName() + " takes " + e + " from inputQueue.");
				outputQueue.add(e);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			counter--;
		}
		
	}
}
