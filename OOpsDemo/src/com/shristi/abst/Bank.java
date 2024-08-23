package com.shristi.abst;

public abstract class Bank {

	abstract void carLoan();

	abstract void HouseLoan();

	abstract void educationLoan();

	void admin() {
		System.out.println("Admin Deails of Bank");
	}

}
