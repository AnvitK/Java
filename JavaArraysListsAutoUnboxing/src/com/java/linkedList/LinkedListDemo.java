package com.java.linkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<String> places = new LinkedList<String>();
		addInOrder(places, "USA");
		addInOrder(places, "Japan");
		addInOrder(places, "Australia");
		addInOrder(places, "Dubai");
		addInOrder(places, "England");

//		System.out.println(places);
		
		printList(places);
//		places.add(1, "Russia");
////		System.out.println(places);
//		printList(places);
		addInOrder(places, "Russia");
//		places.remove(3);
		printList(places);
		
		visit(places);
		
	}
	
	private static void printList(LinkedList<String> placesList) {
		
		Iterator<String> i = placesList.iterator();
		
		while(i.hasNext()) {   // i.hasNext() --> is there a next entry/data/record
			System.out.println("Now visiting " + i.next());    // i.next() --> gives current record and also moves onto the next record
		}
		
		System.out.println("=========================================");
		
	}
	
	private static boolean addInOrder(LinkedList<String> placesList, String newCountry) {
		ListIterator<String> strListIterator = placesList.listIterator();
		
		while(strListIterator.hasNext()) {
			int compare = strListIterator.next().compareTo(newCountry);
			if(compare == 0) {
				System.out.println(newCountry + "is already present");
				return false;
			}
			else if(compare > 0) {
				strListIterator.previous();
				strListIterator.add(newCountry);
				return true;
			}
			else if(compare < 0) {
				
			}
		}		
		strListIterator.add(newCountry);
		return true;
	}
	
	private static void visit(LinkedList placesList ){
		Scanner sc = new Scanner(System.in);
		boolean quit = false, goingFwd = true;
		ListIterator<String> strListIterator = placesList.listIterator();
		
		if(placesList.getFirst() == "") {
			System.out.println("No cities in the list");
		}
		else {
			System.out.println("Now visiting " + strListIterator.next());
			printMenu();
		}
		
		while(!quit) {
			int action = sc.nextInt();
			sc.nextLine();
			
			switch(action) {
			
				case 0 :	System.out.println("Holiday vacation over");
							quit = true;
							break;
							
				case 1 :    if(!goingFwd) {
								if(strListIterator.hasNext()) {
									strListIterator.next();
								}
								goingFwd = true;
							}
							if(strListIterator.hasNext()) {
								System.out.println("Now visiting " + strListIterator.next());
							}
							else {
								System.out.println("Reached the end of the list");
								goingFwd = false;
							}
							break;
							
				case 2 :    if(goingFwd) {
								if(strListIterator.hasPrevious()) {
									strListIterator.previous();
								}
								goingFwd = false;
							}
							if(strListIterator.hasPrevious()) {
								System.out.println("Now visiting " + strListIterator.previous());
							}
							else {
								System.out.println("Reached the start of the list");
								goingFwd = true;
							}
							break;
				
				case 3 :	printMenu(); 
					
			}	
		}
	}
	
	
	private static void printMenu() {
		System.out.println("Available actions: \npress");
		System.out.println("0 - quit\n"
				+ "1 - goto next city\n"
				+ "2 - goto previous city\n"
				+ "3 - print menu options");
	}
	
}
