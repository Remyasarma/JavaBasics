package com.thread.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ConcurDemo {

	public static void main(String[] args) {
		
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		Runnable runner = ()->{
			System.out.println("Task1 Completed");
		};
		Runnable runner1 = ()->{
			System.out.println("Task2 Completed");
		};
		executorService.execute(runner);
		executorService.execute(runner1);
		executorService.shutdown();

	}

}
