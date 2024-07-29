package com.shristi.objbasics;

public class Student {

		String name, department;
		int[] marks;

		Student(String name, String department,int[] marks ) 
		{
			this.name = name;
			this.department = department;
			this.marks=marks;
		}
		void printDetails()
		{
			System.out.println("Student Details");
			System.out.println("Student name : "+name);
			System.out.println("Student department : "+department);
			System.out.println("Student marks : ");
			 for (int mark : marks) {
		            System.out.print(mark + " ");
		        }
			System.out.println();
		}
		int sum=0,avg=0;
		String getGrades(int... marks)
		{
			for(int mark:marks)
			{
				sum=sum+mark;
			}
			double avg=sum/marks.length;
			System.out.println("Sum of marks :"+sum);
			System.out.println("Average of marks :"+avg);
			if(avg>=90 && avg<=100)
			{
				return "Grade is A";
			}
			else if(avg>=80 && avg<90)
			{
				return "Grade is B";
			}
			else if(avg>=70 && avg<80)
			{
				return "Grade is C";
			}
			else if(avg>=60 && avg<70)
			{
				return "Grade is D";
			}
			else if(avg>=50 && avg<60)
			{
				return "Grade is E";
			}
			else
			{
				return "Fail";
			}
		}
		
		
}
