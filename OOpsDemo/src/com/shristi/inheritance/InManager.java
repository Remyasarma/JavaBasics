package com.shristi.inheritance;

public class InManager extends InEmployee {

	double salary;

	public InManager(int empId, String empName, double salary) {
		super(empId, empName);
		this.salary = salary;
	}

	void calaBonus(int amount) {
		System.out.println(salary + amount);
	}

}
