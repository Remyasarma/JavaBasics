package com.oops.encap;

public class BeanDemo {

	public static void main(String[] args) {
		Student student = new Student();
		student.setStudentName("Remya");
		student.setStudentId(1);
		student.setMobile(97367498);
		student.setNewEnrollment(true);
		
		System.out.println(student.getStudentName());
		System.out.println(student.getStudentId());
		System.out.println(student.getMobile());
		System.out.println(student.isNewEnrollment());

	}

}
