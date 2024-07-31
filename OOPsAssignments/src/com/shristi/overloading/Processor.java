package com.shristi.overloading;

public class Processor {

	void calculate(double x) {
		System.out.println("Square Root of : " + x + " is : " + Math.sqrt(x));
	}

	void calculate(int x, int y) {
		System.out.println("Product of " + x + " and " + y + " is : " + (x * y));
	}

	void calculate(double x, double y) {
		System.out.println("Difference between " + x + " and " + y + " is : " + (x - y));
	}

	void calculate(double x, int y) {
		System.out.println("Power of number " + x + " with " + y + " is : " + Math.pow(x, y));
	}

	void calculate(int x) {
		System.out.println("Square of " + x + " is : " + (x * x));
	}
}
