package com.skilldistillery.jets;

import java.util.Scanner;

public class JetsApp {

	//two fields max
	private AirField airfield = new AirField();
	private Scanner keyboard  = new Scanner(System.in);
	
	public static void main(String[] args) {
		JetsApp ja = new JetsApp();
		
		ja.launchApp();
	}
	
	
	public JetsApp() {
		super();
	}

	public void launchApp() {
		airfield = new AirField();
		
		while(true) {
			displayUserMenu();
			System.out.println("Please enter your choice: ");
			int choice = keyboard.nextInt();
			
			switch(choice) {
			case 1:
				airfield.listFleet();
				break;
			
			case 2:
				airfield.flyAll();
				break;
			
			case 3:
				airfield.viewFastest();
				break;
				
			case 4:
				airfield.viewLongestRange();
				break;
				
			case 5:
				airfield.loadAllCargo();
				break;
				
			case 6:
				airfield.dogFight();
				break;
			
			case 7:
				System.out.println("Choose the jet type to add: ");
				System.out.println("1. Cargo jet \n2. Fighter jet \n3. Passenger jet");
				System.out.print("Enter you choice: ");
				int option = keyboard.nextInt();
				System.out.println("Enter the jet model: ");
				String model = keyboard.next();
				System.out.println("Enter speed of the jet: ");
				double speed = keyboard.nextDouble();
				System.out.println("Enter range of the jet: ");
				int range = keyboard.nextInt();
				System.out.println("Enter price of the jet: ");
				long price = keyboard.nextLong();
				
				switch(option) {
				case 1:
					Jet cargoJet = new CargoJet(model, speed, range, price);
					airfield.addJet(cargoJet);
					System.out.println(model + " added to fleet.");
					break;
				case 2:
					Jet fighterJet = new FighterJet(model, speed, range, price);
					airfield.addJet(fighterJet);
					System.out.println(model + " added to fleet.");
					break;
				case 3:
					Jet passJet = new CargoJet(model, speed, range, price);
					airfield.addJet(passJet);
					System.out.println(model + " added to fleet.");
					break;
				default:
					System.out.println("Invalid choice");
				}
				break;
				
			case 8:
				airfield.listFleet();
				System.out.println("Enter index of jet to remove: ");
				int index = keyboard.nextInt();
				airfield.removeJet(index);
				break;
			case 9:
				System.out.println("Good bye");
				return;
			default:
				System.out.println("Invalid choice. Please enter a number between 1 to 9: ");
			}
		}		
	}
	
	public void displayUserMenu() {
		System.out.println("Menu:");
		System.out.println("1. List fleet");
		System.out.println("2. Fly all jets");
		System.out.println("3. View fastest jet");
		System.out.println("4. View jet with longest range");
		System.out.println("5. Load all Cargo Jets");
		System.out.println("6. Dogfight!");
		System.out.println("7. Add a jet Fleet");
		System.out.println("8. Remove a jet from Fleet");
		System.out.println("9. Quit");
	}
}
