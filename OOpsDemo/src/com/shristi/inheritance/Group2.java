package com.shristi.inheritance;

public class Group2 extends TeamLeader{

	public Group2(String name) {
		super(name);
	}

	@Override
	void doProject() {
		System.out.println("Project using .net");
	}
	
	void breaks()
	{
		System.out.println("Have tea at pantry");
	}
}
