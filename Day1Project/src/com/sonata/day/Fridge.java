package com.sonata.day;

public class Fridge implements  Machine {
	private String brand1;
	public String getBrand1() {
		return brand1;
		
	}
	 
	public void setBrand1(String brand1) {
		this.brand1 =brand1;
		
	}

	@Override
	public String speedUp() {
	
		return "THIS FRIDGE IS COOLS VERY FAST";
	}

	@Override
	public String slowDown() {
		
		return "IF IT IS NOT ON THE WORK WILL BE SLOW DOWN";
	}
public static void main (String args[]) {
	Fridge f1 = new Fridge();
	System.out.println(f1.turnAlarmOn());
	System.out.println(f1.turnAlarmOff());
}
}
