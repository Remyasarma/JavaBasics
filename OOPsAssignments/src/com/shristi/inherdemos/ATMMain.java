package com.shristi.inherdemos;

import java.util.Scanner;

public class ATMMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Account account = null;

		System.out.println("Welcome to ATM");
		System.out.println("Select the Account Type 1.Savings 2.Current");
		int choice = sc.nextInt();
		if (choice == 1) {
			account = new Savings(1000);
		} else if (choice == 2) {
			account = new Current(1000);
		} else {
			System.out.println("Invalid account type selected.");
			return;
		}
		while (true) {
			System.out.println("ATM Menu: 1. Withdraw 2. Deposit 3. Check Balance 4. Exit");
			int option = sc.nextInt();

			switch (option) {
			case 1:
				System.out.println("Enter amount to withdraw: ");
				double withdrawAmount = sc.nextDouble();
				account.withdraw(withdrawAmount);
				break;
			case 2:
				System.out.println("Enter amount to deposit: ");
				double depositAmount = sc.nextDouble();
				account.deposit(depositAmount);
				break;
			case 3:
				System.out.println("Current balance: " + account.getBalance());
				break;
			case 4:
				System.out.println("Exiting. Thank you for using the ATM. Have a great day ");
				sc.close();
				return;
			default:
				System.out.println("Invalid option. Please try again.");
			}
		}
	}
}
