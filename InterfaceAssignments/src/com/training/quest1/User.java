package com.training.quest1;

import java.util.Scanner;

public class User {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the user either student/employee");
		String userInput = sc.nextLine();
		Institute institute;
		if(userInput.equalsIgnoreCase("STUDENT"))
		{
			institute = new StudentCourses();
			String[] stuCourses=institute.showCourses();
			for(String courses : stuCourses)
			{
				System.out.println(courses);
			}
			
		}
		else if (userInput.equalsIgnoreCase("EMPLOYEE"))
		{
			institute = new EmployeeCourses();
			institute.showCourses();
			String[] empCourses=institute.showCourses();
			for(String courses : empCourses)
			{
				System.out.println(courses);
			}
		}
		else
		{
			System.out.println("Invalid user");
		}
	}

}
