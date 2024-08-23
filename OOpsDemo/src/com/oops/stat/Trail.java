package com.oops.stat;

public class Trail {
	
	static int x=100;
	static int y;
	static
	{
		x=100;
		y=200;
		System.out.println("In static block 1");
		System.out.println(x+y);
	}
	static
	{
		System.out.println("In static block 2");
	}
	
	private Trail() {
		super();
		System.out.println("Inside constructor");
	}
	{
		System.out.println("In static block 1");
	}
	{
		System.out.println("In static block 2");
	}
	static void checker()
	{
		System.out.println("Checking numbers "+(x+y));
	}
	
	/*
	 * public static void main(String[] args) { Trail.checker(); Trail trail1=new
	 * Trail(); Trail trail2=new Trail();
	 * 
	 * }
	 */

	
}
