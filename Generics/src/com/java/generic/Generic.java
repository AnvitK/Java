package com.java.generic;

import java.util.ArrayList;

public class Generic {
	
	public static void main(String[] args) {
	
		ArrayList<Integer> items  = new ArrayList<Integer>();
		items.add(1);
		items.add(2);
//		items.add("Anvit");
		items.add(3);
		items.add(4);
		
		printDoubled(items);
	}
	
	private static void printDoubled(ArrayList<Integer> items) {
		
		for(int item : items) {
			System.out.println(item * 2);
		}
		
	}
	
}
