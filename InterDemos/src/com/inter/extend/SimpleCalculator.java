package com.inter.extend;

public class SimpleCalculator implements NewCalculator {

	@Override
	public void add(int x, int y) {
		System.out.println(x + y);

	}

	@Override
	public void product(int x, int y) {
		System.out.println(x*y);
	}

}
