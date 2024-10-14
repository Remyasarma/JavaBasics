package com.thread.basics;

class Runner implements Runnable
{

	public Runner(String name, int priority) {
		Thread th= new Thread(this,name);
		th.start();
		System.out.println(th.getPriority());
	}

	@Override
	public void run() {
		String n = Thread.currentThread().getName();
		System.out.println("lucky day"+n);	
	}
}
public class RunThread {

	public static void main(String[] args) {
		/*Runner runner=new Runner();
		Thread th= new Thread(runner,"Poppy");
		th.start();
		
		Runner runner1=new Runner();
		Thread th1= new Thread(runner,"Poppy");
		th1.start();*/
		
		Runner runner =new Runner("Pop1",Thread.MIN_PRIORITY+4);
		Runner runner1 =new Runner("Pop2",Thread.MIN_PRIORITY+4);
		Runner runner2 =new Runner("Pop3",Thread.MIN_PRIORITY+4);
		
		

	}

}
