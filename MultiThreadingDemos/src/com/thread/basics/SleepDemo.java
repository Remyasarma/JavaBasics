package com.thread.basics;

public class SleepDemo {

	public static void main(String[] args) {
		Thread th= Thread.currentThread();
		System.out.println(th);
		for(int i=0;i<=10;i++)
		{
			System.out.println(i+"* 2 = "+i*2 );
		}
		try
		{
			Thread.sleep(3000);
		}catch(InterruptedException ie)
		{
			ie.printStackTrace();
		}
	}

}
