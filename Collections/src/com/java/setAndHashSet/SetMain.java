package com.java.setAndHashSet;

import java.util.*;

public class SetMain {

	public static void main(String[] args) {
		
		Set<Integer> squares = new HashSet<>();
		Set<Integer> cubes = new HashSet<>();
		
		for(int i = 1; i <= 100; i++) {
			squares.add(i * i);
			cubes.add(i * i * i);
		}
		
		System.out.println("Squares  size : " + squares.size() + " and Cubes size : " + cubes.size());
		
		Set<Integer> union = new HashSet<>(squares);
		union.addAll(cubes);
		System.out.println("Union : "+ union.size());
		
		Set<Integer> intersection = new HashSet<>(squares);
		intersection.retainAll(cubes);
		System.out.println("Intersection : "+ intersection.size());
		for(int i : intersection) {
			System.out.println(i + " is the square of " + Math.sqrt(i) + " and is the cube of " + Math.cbrt(i));
		}
		
		Set<String> manoh1 = new HashSet<>();
		String sen1 = "manu chaddu padu hagu randu";
		String[] padWords = sen1.split(" ");
		manoh1.addAll(Arrays.asList(padWords));
		for(String s : manoh1) {
			System.out.print(s + "\t");
		}
		System.out.println("\n");
		
		Set<String> manoh2 = new HashSet<>();
		String[] dekarWords = {"manu", "motha", "hagu", "deku", "gandu"};
		manoh2.addAll(Arrays.asList(dekarWords));
		
		System.out.println("manoh1 - manoh2 : ");
		Set<String> diff1 = new HashSet<>(manoh1);
		diff1.removeAll(manoh2);
		printSet(diff1);
		
		System.out.println("manoh2 - manoh1 : ");
		Set<String> diff2 = new HashSet<>(manoh2);
		diff2.removeAll(manoh1);
		printSet(diff2);
		
		Set<String> unionTest = new HashSet<>(manoh1);
		unionTest.addAll(manoh2);
		Set<String> intersectionTest = new HashSet<>(manoh1);
		intersectionTest.retainAll(manoh2);
		System.out.println("Symmteric difference: ");
		unionTest.removeAll(intersectionTest);
		printSet(unionTest);
		
		if(manoh1.containsAll(manoh2)) {
			System.out.println("manoh2 is the subset of manoh1");
		}
		if(manoh1.containsAll(intersectionTest)) {
			System.out.println("intersectionTest is the subset of manoh1");
		}
		if(manoh2.containsAll(intersectionTest)) {
			System.out.println("intersectionTest is the subset of manoh2");
		}
		
	}

	private static void printSet(Set<String> set) {
		for(String s : set) {
			System.out.print(s + "  ");
		}
		System.out.println();
	}
}
