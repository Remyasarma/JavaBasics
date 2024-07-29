package com.shristi.overloading;

public class Employee {
	
	String name;
    String designation;

    Employee(String name, String designation) 
    {
        this.name = name;
        this.designation = designation;
    }

    double calcBonus(double basicAllowance) 
    {
        return basicAllowance * 0.1; 
    }

    double calcBonus(double basicAllowance, double carAllowance) 
    {
        return basicAllowance * 0.1 + carAllowance * 0.05;
    }

    double calcBonus(double basicAllowance, double carAllowance, double houseAllowance) 
    {
        return basicAllowance * 0.1 + carAllowance * 0.05 + houseAllowance * 0.03;
    }

	@Override
	public String toString() {
		return "Employee [name=" + name + ", designation=" + designation + "]";
	}
}
