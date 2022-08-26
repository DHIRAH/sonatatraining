package com.sonata2.day3;

public class TeamLead extends employee {

	@Override
	public void salCal() {
		
		System.out.println("TeamLead salary");
		
	}
	public static void main(String args[]) {
		TeamLead m1 = new TeamLead();
		m1.salCal();
		
	}
	
	

}
