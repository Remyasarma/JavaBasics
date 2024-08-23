package com.training.quest1;

import java.time.Instant;
import java.time.InstantSource;

public class StudentCourses implements Institute {

	@Override
	public String[] showCourses() {
		return new String[] {"python","java","angular"};
	}

}
