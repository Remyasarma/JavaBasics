package com.inter.ex;

public class CalcMain {

	public static void main(String[] args) {
		IScientific iscientific = new ScientificCalculator();
		iscientific.add(10, 5);
		iscientific.product(10, 5);
		iscientific.square(5);
		iscientific.cube(5);
	}
}
