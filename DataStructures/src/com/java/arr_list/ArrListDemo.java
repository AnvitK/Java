package com.java.arr_list;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrListDemo {

	public static void main(String[] args) {
		
		ArrayList<String> arr = new ArrayList<>();
		arr.add("Apple");
		arr.add("Guava");
		arr.add("Mango");
		arr.add("Grapes");
		arr.add("Watermelon");
		
		System.out.println("ArrayList of fruits: "+arr);
		
		arr.remove(3);
		arr.remove("Mango");
		
		System.out.println("ArrayList of fruits after removing: "+arr);
		
		System.out.println("Size of fruit ArrayList is "+arr.size());
		
		System.out.println("Extracting fruits using iterator");
		
		Iterator<String> it = arr.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
	}

}
