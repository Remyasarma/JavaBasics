package com.shristi.overloading;

import java.util.Scanner;

public class OverloadMain {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
        System.out.println("Enter details for first employee:");

        System.out.println("Enter employee name: ");
        String name1 = scanner.nextLine();

        System.out.println("Enter employee designation (Programmer, Manager, Director): ");
        String designation1 = scanner.nextLine();

        Employee employee1 = new Employee(name1, designation1);
        processBonus(scanner, employee1);

        System.out.println("\nEnter details for second employee:");

        System.out.println("Enter employee name: ");
        String name2 = scanner.nextLine();

        System.out.println("Enter employee designation (Programmer, Manager, Director): ");
        String designation2 = scanner.nextLine();

        Employee employee2 = new Employee(name2, designation2);
        processBonus(scanner, employee2);

        System.out.println("\nEnter details for third employee:");

        System.out.println("Enter employee name: ");
        String name3 = scanner.nextLine();

        System.out.println("Enter employee designation (Programmer, Manager, Director): ");
        String designation3 = scanner.nextLine();

        Employee employee3 = new Employee(name3, designation3);
        processBonus(scanner, employee3);
        
        scanner.close();
    }

    private static void processBonus(Scanner scanner, Employee employee) {
        double basicAllowance, carAllowance, houseAllowance;
        double bonus = 0;

        switch (employee.designation.toLowerCase()) {
            case "programmer":
                System.out.println("Enter basic allowance: ");
                basicAllowance = scanner.nextDouble();
                bonus = employee.calcBonus(basicAllowance);
                break;
            case "manager":
                System.out.println("Enter basic allowance: ");
                basicAllowance = scanner.nextDouble();
                System.out.println("Enter car allowance: ");
                carAllowance = scanner.nextDouble();
                bonus = employee.calcBonus(basicAllowance, carAllowance);
                break;
            case "director":
                System.out.println("Enter basic allowance: ");
                basicAllowance = scanner.nextDouble();
                System.out.println("Enter car allowance: ");
                carAllowance = scanner.nextDouble();
                System.out.println("Enter house allowance: ");
                houseAllowance = scanner.nextDouble();
                bonus = employee.calcBonus(basicAllowance, carAllowance, houseAllowance);
                break;
            default:
                System.out.println("Invalid designation!");
                break;
        }

        scanner.nextLine();

        System.out.println("The bonus for " + employee.name + " (" + employee.designation+ ") is: " + bonus);
    }
}
