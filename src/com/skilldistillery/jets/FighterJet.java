package com.skilldistillery.jets;

public class FighterJet extends Jet implements CombatReady{

	public FighterJet(String model, double speed, int range, long price) {
		super(model, speed, range, price);
		// TODO Auto-generated constructor stub
	}

	
	public String getType() {
		return "Fighter jet";
	}
	
	@Override
	public void fly() {
		double flightTime = getRange() /getSpeed();
		System.out.println(this);
		System.out.println("Flight time until empty: " + flightTime);
		System.out.println();
		
	}


	@Override
	public void fight() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public String toString() {
		return "Fighter jet," + super.toString();
	}
	
	

}
