package com.thread.basics;

public class ThreadDemo {
	public static void main(String[] args) {
		Thread th= Thread.currentThread();
		System.out.println(th);
		th.setName("poppy");
		th.setPriority(Thread.NORM_PRIORITY+2);
		System.out.println(th);
	}

}
