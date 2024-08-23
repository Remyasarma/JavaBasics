package com.inter.extend;

public class EmpDetails implements IBonusCalculator, ILoanCalculator{

	@Override
	public void calculate(double amount) {
		System.out.println("Bonus "+(amount*2));
		
	}

	@Override
	public void printDetails() {
		System.out.println("printing emp details");
		IBonusCalculator.super.printDetails();
		ILoanCalculator.super.printDetails();
	}

}
