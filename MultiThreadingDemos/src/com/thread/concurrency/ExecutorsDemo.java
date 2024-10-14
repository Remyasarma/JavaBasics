package com.thread.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*class Tech implements Runnable
{

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		System.out.println("Great Day");
	}
	
}*/

public class ExecutorsDemo {
	 public static void main(String[] args) {
		/*Thread thread = new Thread(()->{
			thread.start());
			
			Thread thread = new Thread(()->{
				thread.start()) */
		
			ExecutorService executorService = Executors.newFixedThreadPool(10);
			 for (int i=0;i<10;i++)
			 {
			executorService.execute(
					()->{
						try
						{
							System.out.println("Great Day"+Thread.currentThread().getName());
							Thread.sleep(2000);
						}
						catch(InterruptedException ie)
						{
						ie.printStackTrace();
						}
						});		
		 }
		 
			
	}
}
