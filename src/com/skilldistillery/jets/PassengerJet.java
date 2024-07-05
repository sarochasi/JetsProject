package com.skilldistillery.jets;

public class PassengerJet extends Jet{

	public PassengerJet(String model, double speed, int range, long price) {
		super(model, speed, range, price);
	}
	
	
	public String getType() {
		return "Passenger jet";
	}

	@Override
	public void fly() {
		double flightTime = getRange() /getSpeed();
		System.out.println(this);
		System.out.println("Flight time until empty: " + flightTime);
		System.out.println();
		
	}
	
	@Override
	public String toString() {
		return "Passenger jet," + super.toString();
	}

	
}
