package com.shristi.inheritance;

public class Group1 extends TeamLeader {

	public Group1(String name) {
		super(name);
	}

	@Override
	void doProject() {
		System.out.println("Project using Java");
	}
	
	void playGames()
	{
		System.out.println("Paly TT in cafeteria");
	}
}
