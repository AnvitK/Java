package com.java.collectionMap;

import java.util.HashMap;
import java.util.Map;

public class MapCode {

	public static void main(String[] args) {
		
		Map<String, String> words = new HashMap<>();
		if(words.containsKey("hagu")) {
			System.out.println("hagu already exists");
		} else {
			words.put("hagu", "hagu means hagana");
			System.out.println("hagu added successfully");
		}
		
		words.put("dheku", "dheku means dheka");
		words.put("padu", "padu means padana");
		System.out.println(words.put("gendu", "gendu means motu"));
		
//		System.out.println(words.get("gendu"));
		
		System.out.println(words.put("gendu", "gendu means motha gandu + genda"));
		System.out.println(words.get("gendu"));
		
		System.out.println("===================================================");
		
		if(words.remove("dheku","dheku means dheka")) {
			System.out.println("dheku removed");
		} else {
			System.out.println("dheku not removed, key/value pair not found");
		}
		
		words.put("dheku", "dheku means dheka");
		if(words.replace("dheku","dheku means dheka dheka" ,"dheku means motha wala dheka")) {
			System.out.println("dheku replaced");
		} else {
			System.out.println("dheku not replaced");
		}
		
		for(String key : words.keySet()) {
			System.out.println(key + " : " + words.get(key));
		}
		
		
 		
	}

}
