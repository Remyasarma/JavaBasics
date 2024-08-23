package com.inter.extend;

public class EmpMain {

	public static void main(String[] args) {
		IBonusCalculator ibonuscalculator = new EmpDetails();
		ibonuscalculator.calculate(10000);
		ibonuscalculator.printDetails();
		System.out.println();
		ILoanCalculator iloancalculator = new EmpDetails();
		iloancalculator.calculate(1000);
		iloancalculator.printDetails();
	}

}
