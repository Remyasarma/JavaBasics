package com.training.quest1;

public class EmployeeCourses implements Institute {

	@Override
	public String[] showCourses() {
		return new String[] {"JFS","Agile","cloud","spring"};
	}

}
