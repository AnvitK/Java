package com.java.adventure;

import java.util.*;

public class Adventure {

	private static Map<Integer, Location> locations = new HashMap<Integer, Location>();
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Map<String, Integer> tempExit = new HashMap<String, Integer>();
		locations.put(0, new Location(0, "You are sitting in front of a computer learning Java",tempExit));
        
		tempExit = new HashMap<String, Integer>();
        tempExit.put("W", 2);
        tempExit.put("E", 3);
        tempExit.put("S", 4);
        tempExit.put("N", 5);
        locations.put(1, new Location(1, "You are standing at the end of a road before a small brick building",tempExit));
//        tempExit.put(1). ("Q", 0);
        
        
        tempExit = new HashMap<String, Integer>();
        tempExit.put("N", 5);
        locations.put(2, new Location(2, "You are at the top of a hill",tempExit));
//        tempExit.put(2). ("Q", 0);
        
        tempExit = new HashMap<String, Integer>();
        tempExit.put("W", 1);
        locations.put(3, new Location(3, "You are inside a building, a well house for a small spring",tempExit));
//        tempExit.put(3). ("Q", 0);
        
        tempExit = new HashMap<String, Integer>();
        tempExit.put("N", 1);
        tempExit.put("W", 2);
        locations.put(4, new Location(4, "You are in a valley beside a stream",tempExit));
//        tempExit.put(4). ("Q", 0);
        
        tempExit = new HashMap<String, Integer>();
        tempExit.put("S", 1);
        tempExit.put("W", 2);
        locations.put(5, new Location(5, "You are in the forest",tempExit));
//        tempExit.put(5). ("Q", 0);
        
        Map<String, String> vocab = new HashMap<String, String>();
        vocab.put("QUIT", "Q");
        vocab.put("NORTH", "N");
        vocab.put("SOUTH", "S");
        vocab.put("EAST", "E");
        vocab.put("WEST", "W");
        
        
		int loc = 1;
		while(true) {
			System.out.println(locations.get(loc).getDescription());
			tempExit.remove("S");
			
			if(loc == 0) {
				break;
			}
			
			Map<String, Integer> exits = locations.get(loc).getExits();
			System.out.print("Available exits are : ");
			for(String exit : exits.keySet()) {
				System.out.print(exit + ", ");
			}
			System.out.println();
			
			String dir = sc.nextLine().toUpperCase();
			if(dir.length() > 1) {
				String [] words = dir.split(" ");
				for(String word : words) {
					if(vocab.containsKey(word)) {
						dir = vocab.get(word);
						break;
					}
				}
			}
			
			if(exits.containsKey(dir)) {
				loc = exits.get(dir);
			} else {
				System.out.println("You cannot go int that diraction");
			}
			
//			loc = sc.nextInt();
			if(!locations.containsKey(loc)) {
				System.out.println("You cannot go in that direction");
			}
		}
        
//		String[] computer = "You are sitting in front of a computer learning Java".split(" ");    // using split function to store string int a string arr
//		String[] building = "You are inside a building, a well house for a small spring".split(", ");
//
//		for(String i : computer) {
//			System.out.println(i);
//		}		
//		System.out.println("==============================================================================");
//		for(String i : building) {
//			System.out.println(i);
//		}
	}
	
}
