package com.shristi.overloading;

public class OverloadMain {

	public static void main(String[] args) {

		Employee[] employees = new Employee[3];
		employees[0] = new Employee("Remya", "Programmer");
		employees[1] = new Employee("Varun", "Manager");
		employees[2] = new Employee("Devu", "Director");
		for (int i = 0; i < employees.length; i++) {
			System.out.println("Employee name :" + employees[i].name);
			String empDesignation = employees[i].designation;
			double salary = 0;
			switch (empDesignation.toUpperCase()) {
			case "PROGRAMMER":
				salary = employees[i].calcBonus(15000);
				break;
			case "MANAGER":
				salary = employees[i].calcBonus(15000, 20000);
				break;
			case "DIRECTOR":
				salary = employees[i].calcBonus(15000, 20000, 5000);
				break;
			}
			System.out.println("Salary :" + salary);

		}

	}

}
