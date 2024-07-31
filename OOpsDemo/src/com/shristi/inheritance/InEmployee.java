package com.shristi.inheritance;

public class InEmployee {

	int empId;
	String empName;

	void printDetails() {
		System.out.println("Employee ID :" + empId);
		System.out.println("Employee Name :" + empName);
	}

	public InEmployee(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}

}
