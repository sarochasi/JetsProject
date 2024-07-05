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
		System.out.println("I'm a Cargojet. Noise?????"); //TODO create****
		
	}

	
}
