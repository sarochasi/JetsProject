package com.skilldistillery.jets;

public class PassengerJet extends Jet{

	public PassengerJet(String model, double speed, int range, long price) {
		super(model, speed, range, price);
	}

	@Override
	public void fly() {
		double flightTime = getRange() /getSpeed();
//		System.out.println("Jet details:");
//		System.out.println("Model: " + super.getModel());
//		System.out.println("Speed: " + super.getSpeed());
//		System.out.println("Range: " + super.getRange());
//		System.out.println("Price: " + super.getPrice());
		System.out.println(this);
		System.out.println("Flight time until empty: " + flightTime);
		
		
	}

	
}
