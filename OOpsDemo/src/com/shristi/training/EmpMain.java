package com.shristi.training;

public class EmpMain {

public static void main(String[] args) {
		
		/*Employee employee =new Employee();
		employee.employeeName = "Remya";
		employee.employeeID =10;
		employee.printDetails();
		System.out.println(employee.greetMessage("Have a good day"));
		
		Employee employee1 =new Employee();
		employee1.employeeName = "Ram";
		employee1.employeeID =20;
		employee1.printDetails();
		System.out.println(employee1.greetMessage("Have a good day"));*/
	
		Employee employee =new Employee("Remya",10);
		employee.printDetails();
		System.out.println(employee.greetMessage("Have a good day"));
	
		Employee employee1 =new Employee("Ram",20);
		employee1.printDetails();
		System.out.println(employee1.greetMessage("Have a good day"));
	
			
	}
		

}
