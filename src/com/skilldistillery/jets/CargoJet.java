package com.skilldistillery.jets;

public class CargoJet extends Jet implements CargoCarrier{

	public CargoJet(String model, double speed, int range, long price) {
		super(model, speed, range, price);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void loadCargo() {
		System.out.println(getModel() + " is loading cargo.");
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
		return "Cargo jet," + super.toString();
	}
	
	

	
}
