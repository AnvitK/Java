package com.java.hashset;

import java.util.HashSet;
import java.util.Iterator;



public class SetOfHash {

	public static void main(String[] args) {
		
		HashSet<String> hs = new HashSet<>();
		hs.add("Anvit");
		hs.add("Nishant");
		hs.add("Yash");
		hs.add("Rohith");
		hs.add("Darshu");
		hs.add("Anvit");

		System.out.println("Hash Set: "+hs);
		
		Iterator<String> it = hs.iterator();
		
		System.out.println("Elements using iterator: ");
		while(it.hasNext())
		{
			String s = (String) it.next();
			System.out.println(s);
		}
		
	}

}
