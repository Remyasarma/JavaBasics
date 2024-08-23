package com.oops.stat;

import static com.oops.stat.Trail.*;
import static java.lang.Integer.*;
import static java.lang.Math.pow;
import static java.lang.Class.forName;
import static java.lang.System.out;


public class StatDemo {
	
	static int x=100;
	static int y;
	static
	{
		x=100;
		y=200;
		System.out.println("In static block 1 StatDemo");
		System.out.println(x+y);
	}
	static
	{
		System.out.println("In static block 2 StatDemo");
	}
	public static void main(String[] args) {
		try {
			Class.forName("com.oops.stat.Trail");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		int v =Integer.parseInt("100");
		System.out.println(v);
		checker();
		System.out.println(pow(x,2));
		
	}

}