package com.skilldistillery.jets;

import java.util.ArrayList;

public class AirField {
	
	//THIS CLASS CANNOT HAVE ANY ADDITIONAL FIELDS
	private ArrayList<Jet> jets;
	
	public AirField() {
		
		jets = new ArrayList<>();
		//create 5 different jet objects, add them to list
		jets.add(new CargoJet("Boeing 757-200PF UPS", 515, 2800, 218_000_000));
		jets.add(new CargoJet("B767-300ER", 345, 2360, 30_000_000));
		jets.add(new FighterJet("F-35", 1200, 1380, 95_000_000));
		jets.add(new FighterJet("F-22", 1500, 1840, 150_000_000));
		jets.add(new PassengerJet("Boeing 747", 614, 8300, 370_000_000));
		
	}
	
	//DO NOT CREATE A getJets() method.
	

	
	public void listFleet() {
		for (int i = 0; i < jets.size(); i++) {
			System.out.println((i+1) + ". " + jets.get(i).toString());
		}
	}
	
	public void flyAll() {
		for (int i = 0; i < jets.size(); i++) {
			jets.get(i).fly();
		}
	}

	public void viewFastest() {
		double max = 0;
		Jet fastest = null;
		for (Jet jet : jets) {
			if(jet.getSpeed() > max) {
				max = jet.getSpeed();
				fastest = jet;
			}
		
		}
		System.out.println("The fastest jet: " + fastest.toString());
		
	}

	public void viewLongestRange() {
		int longest = 0;
		Jet longestJet = null;
		for (Jet jet : jets) {
			if(jet.getSpeed() > longest) {
				longest = jet.getRange();
				longestJet = jet;
			}
		
		}
		System.out.println("The longest range jet: " + longestJet.toString());
		
	}

	public void loadAllCargo() {
		
		for (int i = 0; i < jets.size(); i++) {
			if(jets.get(i) instanceof CargoCarrier)
			((CargoJet) jets.get(i)).loadCargo();
		}		
	}

	public void dogFight() {
		for (int i = 0; i < jets.size(); i++) {
			if(jets.get(i) instanceof FighterJet)
			((FighterJet) jets.get(i)).fight();
		}	
		
	}
	
	public void addJet(Jet jet) {
		jets.add(jet);
	}
	
	public void removeJet(int index) {
		
		if(index >= 0 && index < jets.size()) {
			System.out.println(jets.get(index-1).getModel() + " was removed.");
			jets.remove(index-1);
			
		}
		else {
			System.out.println("Invalid index.");
		}
		
	}

}
