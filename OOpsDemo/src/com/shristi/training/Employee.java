package com.shristi.training;

public class Employee {
	
	String employeeName;
	int employeeID;
	
	
	/*Employee(String name,int id)
	{
		employeeName = name;
		employeeID = id;
	}*/
	
	Employee(String employeeName,int employeeID)
	{
		this.employeeName = employeeName;
		this.employeeID = employeeID;
	}
	
	void printDetails()
	{
		System.out.println("Employee Name :"+employeeName);
		System.out.println("Employee ID :"+employeeID);
	}
	
	String greetMessage(String message)
	{
		return message;
	}

}
