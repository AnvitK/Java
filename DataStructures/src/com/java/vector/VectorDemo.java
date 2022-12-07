package com.java.vector;

import java.util.ListIterator;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<>();
		
		int arr[] = {10,30,50,70,90};
		
		for(int i=0;i<arr.length;i++)
		{
			v.add(arr[i]);
		}
		
		System.out.println("Vector elements: ");
		
		for(int i=0;i<v.size();i++)
		{
			System.out.print(v.get(i)+" ");
		}
		
		System.out.println("\nVector elements using ListIterator: ");
		
		ListIterator<Integer> lit = v.listIterator();
		
		System.out.println("In forward direction: ");
		while(lit.hasNext())
		{
			System.out.print(lit.next() + " ");
		}
		
		System.out.println("\nIn backward direction: ");
		while(lit.hasPrevious())
		{
			System.out.print(lit.previous() + " ");
		}
	}

}
