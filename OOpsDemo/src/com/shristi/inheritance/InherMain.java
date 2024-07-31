package com.shristi.inheritance;

public class InherMain {

	public static void main(String[] args) {
		InEmployee employee = new InEmployee(10, "Remya");
		/*
		 * employee.empId = 10; employee.empName = "Remya";
		 */
		employee.printDetails();

		InManager manager = new InManager(20, "Varun", 20000);
		/*
		 * manager.empId = 20; manager.empName = "Varun";
		 */
		manager.printDetails();
		manager.calaBonus(2000);

	}

}
