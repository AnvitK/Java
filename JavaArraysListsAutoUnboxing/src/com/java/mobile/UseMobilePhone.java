package com.java.mobile;

import java.util.Scanner;


public class UseMobilePhone {

	private static Scanner sc = new Scanner(System.in);
	private static MobilePhone mobilePhone = new  MobilePhone("5555566666");
	
	public static void main(String[] args) {
		
		boolean quit = false;
		startPhone();
		printActions();
		while(!quit) {
			System.out.println("\nEnter actions: (6 to show available actions)");
			int action = sc.nextInt();
			
			switch(action) {
				case 0:
					System.out.println("Shutting down...");
					quit = true;
					break;
				
				case 1:
					mobilePhone.printContacts();
					break;
				
				case 2:
					addNewContact();
					break;
					
				case 3:
					updateContact();
					break;
				
				case 4:
					removeContact();
					break;
					
				case 5:
					queryContact();
					break;
					
				case 6:
					printActions();
					break;
			}
		}
		
	}
	
	private static void addNewContact() {
		System.out.println("Enter new contact name: ");
		String name = sc.next();
		System.out.println("Enter new contact phone number: ");
		String phoneNumber = sc.next();
		
		Contact newContact = Contact.createContact(name, phoneNumber);
		
		if(mobilePhone.addNewContact(newContact)) {
			System.out.println("New contact added: name = " + name + ", phone =" + phoneNumber);
		}
		else {
			System.out.println("New contact, " + name + " cannot be added as it already in the mobile phone");
		}
	}
	
	private static void updateContact() {
		System.out.println("Enter existing contact name: ");
		String name = sc.next();
		Contact existingContact = mobilePhone.queryContact(name);
		if(existingContact == null) {
			System.out.println("Contact not found");
			return;
		}
		
		System.out.println("Enter new contact name: ");
		String newName = sc.next();
		System.out.println("Enter new contact number: ");
		String newNumber = sc.next();
		Contact newContact = Contact.createContact(newName, newNumber);
		if(mobilePhone.updateContact(existingContact, newContact)) {
			System.out.println("Successfully updated contact");
		}
		else {
			System.out.println("Error updating contact");
		}
		
	}
	
	
	private static void removeContact() {
		System.out.println("Enter existing contact name: ");
		String name = sc.next();
		Contact existingContact = mobilePhone.queryContact(name);
		if(existingContact == null) {
			System.out.println("Contact not found");
			return;
		}
		
		if(mobilePhone.removeContact(existingContact)) {
			System.out.println("Successfully deleted contact");
		}
		else {
			System.out.println("Error deleting contact");
		}
		
	}
	
	private static void queryContact() {
		System.out.println("Enter existing contact name: ");
		String name = sc.next();
		Contact existingContact = mobilePhone.queryContact(name);
		if(existingContact == null) {
			System.out.println("Contact not found");
			return;
		}
		
		System.out.println("Name: " + existingContact.getName() + " phone number: " + existingContact.getPhoneNumber());
	}
	
	private static void startPhone() {
		System.out.println("Starting phone..");
	}
	
	private static void printActions() {
		System.out.println("\nAvaiable actions:\npress");
		System.out.println("0 - to shutdownn\n" +
						   "1 - to print contacts\n" +
						   "2 - to add a new contact\n" +
						   "3 - to update an existing contact\n" + 
						   "4 - to remove an existing customer\n" +
						   "5 - query if a contact exists " + 
						   "6 - to print a list of available actions. ");
		System.out.println("Choose your action: ");
	}
	
		
}