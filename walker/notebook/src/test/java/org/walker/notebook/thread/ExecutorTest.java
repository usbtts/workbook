package org.walker.notebook.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ExecutorTest {

	public static void main(String[] args) {
		ExecutorService service = Executors.newFixedThreadPool(3);
		ScheduledExecutorService scheduledService = Executors.newScheduledThreadPool(3);
		scheduledService.scheduleAtFixedRate(new Runnable() {

			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName() + " Runnable runs.");
				
			}
			
		}, 0, 200, TimeUnit.MILLISECONDS);
	}
	
}
