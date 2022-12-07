package com.java.Abstract;

public class UseAnimal {
	
	public static void main(String[] args) {
		
		Dog dog = new Dog("Maxie");
		dog.breathe();
		dog.eat();
		
//		Bird bird = new Bird("Parrot");
//		bird.eat();
//		bird.breathe();
		
		Parrot parrot = new Parrot("Indian Parrot");
		parrot.eat();
		parrot.breathe();
		parrot.fly();
		
		Penguin peguin = new Penguin("Penguin");
		peguin.fly();
		
	}

}
