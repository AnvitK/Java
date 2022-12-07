package com.java.ll;

import java.util.LinkedList;
import java.util.Scanner;

public class LLDemo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		LinkedList<String> ll = new LinkedList<>();
		
		ll.add("India");
		ll.add("England");
		ll.add("Bangladesh");
		ll.add("Nepal");
		ll.add("USA");
	
		int ch=0,pos;
		String ele;
		
		while(ch<4)
		{
			System.out.println("LinkedList: "+ll);
			System.out.println("LinkedList Operations");
			System.out.println("1. Add an element");
			System.out.println("2. Remove an element");
			System.out.println("3. Change an element");
			System.out.println("4. Exit");
			
			ch = sc.nextInt();
			
			switch(ch)
			{
				case 1:	System.out.println("Enter an element: ");
						ele = sc.next();
						System.out.println("At what position: ");
						pos = sc.nextInt();
						ll.add(pos-1,ele);
						break;
				
				case 2:	System.out.println("Enter position of the element to be removed: ");
						pos = sc.nextInt();
						ll.remove(pos-1);
						break;
					
				case 3:	System.out.println("Enter position of the element to be changed: ");
						pos = sc.nextInt();
						System.out.println("Enter new element: ");
						ele = sc.next();
						ll.set(pos-1, ele);
						break;
						
				default: return;
			}
		}
	}
}
