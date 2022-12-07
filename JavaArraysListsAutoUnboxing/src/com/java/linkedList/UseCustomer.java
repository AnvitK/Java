package com.java.linkedList;

import java.util.ArrayList;

public class UseCustomer {

	public static void main(String[] args) {
		
		Customer customer1 = new Customer("Anvit", 6764.232);
		Customer customer2;
		customer2 = customer1;  // customer2 object stores the reference of customer1 object (memory address)
	
		customer2.setBalance(2445.53);
		System.out.println("Balance of customer " + customer1.getName() + " is " + customer1.getBalance());
		
		ArrayList<Integer> intList = new ArrayList<Integer>();
		
		intList.add(1);
		intList.add(3);
		intList.add(5);
		
		for(int i = 0; i < intList.size(); i++) {
			System.out.println(i + " ==> " + intList.get(i));
		}
		
		intList.add(1,7);
		
		for(int i = 0; i < intList.size(); i++) {
			System.out.println(i + " ==> " + intList.get(i));
		}
		
	}
}
