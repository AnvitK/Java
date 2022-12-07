package com.java.hashmap;

import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		
		HashMap<String, Long>  pb = new HashMap<>();
		
		String name;
		Long phno;
		
		while(true)
		{
			System.out.println("1. Enter phone entries");
			System.out.println("2. Lookup in the book");
			System.out.println("3. Display names in the phone book");
			System.out.println("4. Exit");
			
			System.out.println("Enter your choice: ");
			int ch = sc.nextInt();
			
			switch(ch)
			{
				case 1: System.out.println("Enter name: ");
						name = sc.next();
						name = name.trim();
						System.out.println("Enter phone number: ");
						phno = sc.nextLong();
						pb.put(name, phno);
						break;
						
				case 2: System.out.println("Enter name to be lookedup: ");
						name = sc.next();
						name = name.trim();
						phno = pb.get(name);
						System.out.println("Phone number is "+phno);
						break;
				
				case 3: Set<String> names_set = new HashSet<String>();
						names_set = pb.keySet();
						System.out.println(names_set);
						break;
				
				case 4: return;
			}
		}
	}

}
