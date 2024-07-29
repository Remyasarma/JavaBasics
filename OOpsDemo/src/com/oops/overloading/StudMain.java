package com.oops.overloading;

public class StudMain {

	public static void main(String[] args) {
		
		Student student =new Student();
		student.studentName = "Remya";
		student.department ="Finance";
		student.mobile =123346;
		student.printDetails();
		System.out.println("Hobbies of "+student.studentName+" are");
		String[] hobbies= student.showhobbies();
		for(String hobby:hobbies)
		{
			System.out.println(hobby);
		}
		
		Student student1 =new Student();
		student1.studentName = "Ram";
		student1.department ="HR";
		student1.mobile =974367789;
		student1.printDetails();
		System.out.println("Hobbies of "+student1.studentName+" are");
		String[] hobbies1= student1.showhobbies();
		for(String hobby:hobbies1)
		{
			System.out.println(hobby);
		}

	}

}
