package com.shristi.abst;

public class BankMain {

	public static void main(String[] args) {

		Bank bank = new Branch1();
		bank.carLoan();
		bank.educationLoan();
		bank.HouseLoan();
		bank.admin();

		Branch1 branch1 = (Branch1) bank;
		branch1.payLoan();

		bank = new SubBranch();
		bank.carLoan();
		bank.educationLoan();
		bank.HouseLoan();

		// Branch2 branch2= (Branch2) bank;
		// branch2.showBills();

		SubBranch subbranch = (SubBranch) bank;
		subbranch.showEMIOptions();
		subbranch.showBills();

	}

}
