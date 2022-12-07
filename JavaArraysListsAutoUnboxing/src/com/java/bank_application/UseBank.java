package com.java.bank_application;

public class UseBank {
	public static void main(String[] args) {
		
		Bank bank = new Bank("Bank Of Maharashtra");
		
		bank.addBranch("Kalyan");
		bank.addCustomer("Kalyan", "Anvit", 2000);
		bank.addCustomer("Kalyan", "Darshana", 5000);
		bank.addCustomer("Kalyan", "Manohar", 10000);
		
		
		bank.addBranch("Thane");
		bank.addCustomer("Thane", "Nishant", 12000);
		
		
		bank.addCustomerTransaction("Kalyan", "Anvit", 2352);
		bank.addCustomerTransaction("Kalyan", "Anvit", 3332);
		bank.addCustomerTransaction("Kalyan", "Darshana", 5452);
		
		bank.listCustomers("Kalyan", true);
		bank.listCustomers("Thane", true);
		
		
		bank.addBranch("Dombivali");
		if(!bank.addCustomer("Dombivali", "Yash", 8980)) {
			System.out.println("Error branch Dombivali does not exists");
		}
		
		if(!bank.addBranch("Thane")) {
			System.out.println("Thane branch already exists");
		}
		
	}
}
