package com.java.setAndHashSet;

public class UseDog {
	
	public static void main(String[] args) {
		GoldenRetriever dog1 = new GoldenRetriever("Max");
		Dog dog2 = new Dog("Max");
		
		System.out.println(dog1.equals(dog2));
		System.out.println(dog2.equals(dog1));
	}

}
