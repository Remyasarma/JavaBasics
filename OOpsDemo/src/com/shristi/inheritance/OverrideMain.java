package com.shristi.inheritance;

public class OverrideMain {

	public static void main(String[] args) {
		TeamLeader team = new Group1("Ganga");
		team.doProject();
		team =new Group2("Yamuna");
		team.doProject();
		
		Group1 one = (Group1) team;
		one.doProject();
		one.playGames();
	}

}
