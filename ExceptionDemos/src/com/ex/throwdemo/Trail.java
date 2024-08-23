package com.ex.throwdemo;

public class Trail {
	public static void main(String[] args) {
		Processor processor = new Processor();
		System.out.println("Started");
		try {
			processor.check(1);
			System.out.println("Process over");
		} catch (Exception e) {
			System.out.println("Error");
		}
		System.out.println("Done");
		

	}
}
