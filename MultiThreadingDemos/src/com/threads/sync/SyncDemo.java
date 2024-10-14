package com.threads.sync;


class Counter implements Runnable
{
	private String name;
	private double amount;
	private LoanCalculator loanCalculator;
	public Counter(String name, double amount,LoanCalculator loanCalculator) {
		this.name =name;
		this.amount=amount;
		this.loanCalculator =loanCalculator;
		Thread th =new Thread(this,name);
		th.start();
	}
	@Override
	public void run() {
		synchronized(loanCalculator) {
		System.out.println("Welcome"+name);
		double interest =loanCalculator.calculateInterest(name,amount);
		System.out.println("Interest calculated "+interest);	
		}
	}
}
public class SyncDemo {

	public static void main(String[] args) {
		LoanCalculator loan = new LoanCalculator();
		Counter counter = new Counter("Ram",50000.0,loan);
		Counter counter1 = new Counter("Remya",60000.0,loan);
		Counter counter2 = new Counter("Raju",70000.0,loan);
		

	}

}
