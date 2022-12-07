package com.java.interFaceChallenge;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
	
		Player anvit = new Player("Anvit", 12, 17);
		System.out.println(anvit);
		saveObject(anvit);

		anvit.setHitPoints(9);
		System.out.println(anvit);
		anvit.setWeapon("Bow");
		saveObject(anvit);
//		loadObject(anvit);
		System.out.println(anvit);
		
		ISaveable  wolf = new Monster("Wolf", 15, 20);       // or Monster wolf = new Monster("Wolf", 15, 20);  then System.out.println("Strength: " + wolf.getStrength());
		System.out.println("Strength: " + ((Monster)wolf).getStrength()); // type casting
		System.out.println(wolf);
		saveObject(wolf);
		
		
	}
	
	public static ArrayList<String> readValues(){
		ArrayList<String> values = new ArrayList<String>();
		
		Scanner sc  = new Scanner(System.in);
		boolean quit = false;
		int index = 0;
		System.out.println("Choose\n"
				+ "1 to enter a string\n"
				+ "0 to quit");
		
		while(!quit) {
			System.out.println("Choose an option: ");
			int ch = sc.nextInt();
			sc.nextLine();
			
			switch(ch) {	
				case 0: 
					quit = true;
					break;
				case 1:
					System.out.println("Enter a string: ");
					String strInput = sc.nextLine();
					values.add(index, strInput);
					index++;
					break;
			}			
		}
		return values;
	}
	
	
	public static void saveObject(ISaveable objectToSave) {
		for(int i = 0; i < objectToSave.write().size(); i++) {
			System.out.println("Saving " + objectToSave.write().get(i) + " to storage device"); 
		}
	}
	
	public static void loadObject(ISaveable  objectToLoad) {
		ArrayList<String> values = readValues();
		objectToLoad.read(values);
	}
}
