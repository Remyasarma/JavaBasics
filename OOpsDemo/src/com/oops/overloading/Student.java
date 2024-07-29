package com.oops.overloading;

public class Student {

	String studentName;
	String department;
	long mobile;
	
	void printDetails()
	{
		System.out.println("Student Name :"+studentName);
		System.out.println("Student Department :"+department);
		System.out.println("Student mobile: "+mobile);
		
	}
	
	String[] showhobbies()
	{
		String[] hobb= {"Reading","Writing","Dancing"};
		return hobb;
	}
}

