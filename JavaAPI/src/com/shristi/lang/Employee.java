package com.shristi.lang;

public class Employee implements Cloneable{
	
	private int empId;
	private String name;
	private Department department;

	@Override
	protected Employee clone() throws CloneNotSupportedException {
		
		//first way
		//create a new department and set the values from original object
		/*Employee copyEmployee =(Employee) super.clone();
		Department newdept = new Department();
		newdept.setDeptId(copyEmployee.getDepartment().getDeptId());
		newdept.setDeptName(copyEmployee.getDepartment().getDeptName());
		copyEmployee.setDepartment(newdept);
		return copyEmployee; */
		
		
		//another way
		//dependent class implements Cloneable
		Employee copyEmployee =(Employee) super.clone();
		Department ogdepartment = copyEmployee.getDepartment();
		//clone the department
		Department newdept = ogdepartment.clone();
		copyEmployee.setDepartment(newdept);
		return copyEmployee;
		
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int empId, String name, Department department) {
		super();
		this.empId = empId;
		this.name = name;
		this.department = department;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", department=" + department + "]";
	}
}
