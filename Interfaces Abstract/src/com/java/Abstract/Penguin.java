package com.java.Abstract;

public class Penguin extends Bird{

	public Penguin(String name) {
		super(name);
	}

	@Override
	public void fly() {
//		super.fly();
		System.out.println("Penguin cannot fly but can swim instead.");
	}

	
	
}
