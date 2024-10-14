package com.shristi.lang;

public class DeepCloneDemo {

	public static void main(String[] args) {
		Department department = new Department(100,"MCA");
		Employee emp=new Employee(1,"Remya",department);
		Employee emp1 = null;
		try {
			emp1 =emp.clone();
			System.out.println(emp1);
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Department dept = emp.getDepartment();
		dept.setDeptName("HR");
		emp1.setDepartment(dept);
		
		System.out.println(emp);
		System.out.println(emp1);

	}

}
