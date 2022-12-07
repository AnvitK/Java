package com.java.bank_application;

import java.util.ArrayList;

public class Bank {

	private String name;
	private ArrayList<Branch> branches;
	
	public Bank(String name) {
		this.name = name;
		this.branches = new ArrayList<Branch>();
	}
	
	public boolean addBranch(String branchName) {
		if(findBranch(branchName) == null) {
			this.branches.add(new Branch(branchName));
			return  true;
		}
		return false;
	}
	
	public boolean addCustomer(String branchName, String customerName, double initialAmount) {
		Branch branch = findBranch(branchName);
		if(branch != null) {      // branch exists or not
			return branch.newCustomer(customerName, initialAmount);
		}
		return false;
	}
	
	public boolean addCustomerTransaction(String branchName, String customerName, double amount) {
		Branch branch = findBranch(branchName);
		if(branch != null) {
			return branch.addCustomerTranscation(customerName, amount);
		}
		return false;
	}
	
	private Branch findBranch(String branchName) {
		for(int i=0; i<this.branches.size(); i++) {
			Branch checkedBranch = this.branches.get(i);
			if(checkedBranch.getName().equals(branchName)) {
				return checkedBranch;
			}
		}
		return null;
	}
	
	public boolean listCustomers(String branchName, boolean showTransactions) {
		Branch branch = findBranch(branchName);
		if(branch != null) {
			System.out.println("Customers lists for branch " + branch.getName());
			
			ArrayList<Customer> branchCustomers = branch.getCustomers();  // list of customers of the particular branchname
			for(int i=0; i<branchCustomers.size(); i++)
			{	
				Customer branchCustomer = branchCustomers.get(i);   // getting customer at a time from the branch 
				System.out.println("(" + (i+1) + ")" + " Customer: " + branchCustomer.getName());
				if(showTransactions) {
					System.out.println("Transactions: ");
					ArrayList<Double> transactions = branchCustomer.getTransactions();  // getting all the transactions of the particular customer 
					for(int j=0; j<transactions.size(); j++) {
						System.out.println("(" + (j+1) + ")" + " Amount: " + transactions.get(j));
					}
				}
			}
			return true;
		}
		else {
			return false;
		}
	}
	
}
