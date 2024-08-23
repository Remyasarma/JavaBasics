package com.inter.extend;

public class DefMain {
	public static void main(String[] args) {
		NewCalculator newcalculator = new SimpleCalculator();
		newcalculator.add(5,10);
		newcalculator.product(5,5);
		NewCalculator.proccessData();
		
	}

}
