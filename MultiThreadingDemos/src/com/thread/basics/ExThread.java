package com.thread.basics;

class Child extends Thread
{

	public Child(String name, int priority) {
		super(name);
		this.setPriority(priority);
		this.start();
	}
	

	@Override
	public void run() {
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
public class ExThread {

	public static void main(String[] args) {
		//Child child= new Child();
		//child.setName("Child-0");
		Child child1 = new Child("Child-1",Thread.MIN_PRIORITY+2);
		Child child2 = new Child("Child-2",Thread.MAX_PRIORITY+2);
		child1.start();
				
		

	}

}
