package com.java.bank_application;

import java.util.ArrayList;

public class Customer {

	private String name;
	private ArrayList<Double> transactions; //declare transactions arrayList
	
	public Customer(String name, double initialAmount) {
		this.name = name;
		this.transactions = new ArrayList<Double>(); // define transactions arrayList
		addTransaction(initialAmount);
	}
	
	public void addTransaction(double amount) {  // autoboxing double amount --> Double amount
		this.transactions.add(amount);
	}

	public String getName() {
		return name;
	}

	public ArrayList<Double> getTransactions() {
		return transactions;
	}
	
	
}
