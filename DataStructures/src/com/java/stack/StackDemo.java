package com.java.stack;

import java.util.Scanner;
import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Stack<Integer> st = new Stack<>();
		
		int ch=0;
		int pos,ele;
		
		while(ch<4)
		{
			System.out.println("Stack Operations");
			System.out.println("1. Push an element");
			System.out.println("2. Pop an element");
			System.out.println("3. Search an element");
			System.out.println("4. Exit");
			
			ch = sc.nextInt();
			
			switch(ch)
			{
				case 1:	System.out.println("Enter an element: ");
						ele = sc.nextInt();
						st.push(ele);
						break;
				
				case 2:	Integer popEle = st.pop(); 
						System.out.println("Popped element: "+popEle);
						break;
					
				case 3:	System.out.println("Enter an elemnt to be searched: ");
						ele = sc.nextInt();
						pos = st.search(ele);
						if(pos==-1) System.out.println("Element not found");
						else System.out.println("Element found at position: "+pos);
						break;
						
				default:
				return;
			}
			System.out.println("Stack contents: "+st);
		}
	}
}
