package com.shristi.objbasics;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		Student[] student= new Student[2];
		for(int i=0;i<student.length;i++)
		{
			System.out.print("Enter the student name : ");
			String name=sc.next();
			System.out.print("Enter the department name : ");
			String department =sc.next();
			System.out.print("Enter number of subjects: ");
		    int numSubjects1 = sc.nextInt();
		    int[] marks1 = new int[numSubjects1];
		    for (int j = 0; j < numSubjects1; j++) 
		    {
		    	System.out.print("Enter mark for subject " + (j + 1) + ": ");
		        marks1[j] = sc.nextInt();
		    }
		student[i]=new Student(name,department,marks1);	
		}
		for(Student students:student)
		{
			students.printDetails();
			String grade = students.getGrades(students.marks);
			System.out.println("Grade :"+grade);
		}	
		sc.close();
	}

}
