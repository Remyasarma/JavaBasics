package com.inter.ex;

public class BasicCalculator implements ICalculator {

	@Override
	public void add(int x, int y) {
		System.out.println("Sum : "+(x+y));
	}

	@Override
	public void product(int x, int y) {
		System.out.println("Sum : "+(x*y));

	}

}
