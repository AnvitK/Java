package com.java.arraysListsAutoUnboxing;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListBasic {
	
	private static Scanner sc = new Scanner(System.in);

	private static ArrayList<String> groceryList = new ArrayList<String>();
	
	public static void  addGroceryItem(String item)
	{
		groceryList.add(item);
	}
	
	public static void viewGroceryList()
	{
		System.out.println("Items in the grocery list: "+groceryList.size());
		for(int i=0;i<groceryList.size();i++)
		{
			System.out.println("Item("+(i+1)+") is "+groceryList.get(i));
		}
	}
	
	public static void changeGroceryItem(int pos, String newItem)
	{
		if(findItem(newItem))
			groceryList.set(pos, newItem);
		else System.out.println("Item not present");
	}
	
	public static void removeGroceryItem(int pos)
	{
		String delItem = groceryList.get(pos);
		groceryList.remove(pos);
		System.out.println(delItem + "item is deleted.");
	}
	
	public static boolean findItem(String item)
	{
		return groceryList.contains(item);
	}
	
	public static void main(String[] args) {

		while(true)
		{
			System.out.println("1. Add Item in Grocery List: ");
			System.out.println("2. View Grocery List: ");
			System.out.println("3. Change Grocercy List Item: ");
			System.out.println("4. Remove Grocercy List Item: ");
			System.out.println("5. Check if Grocercy List Item is present or not: ");
			System.out.println("6. Exit");
			
			int ch;
			System.out.println("Enter choice: ");
			ch = sc.nextInt();
			
			switch(ch)
			{
			
				case 1: 
					String item;
					System.out.println("Enter Item: ");
					item = sc.next();
					addGroceryItem(item);
					break;
				
				case 2:
					viewGroceryList();
					break;
				
				case 3:
					int nPos;
					String nItem;
					System.out.println("Enter new Item: ");
					nItem = sc.next();
					System.out.println("Enter new Item's Position: ");
					nPos = sc.nextInt();
					changeGroceryItem(nPos, nItem);
					break;
				
				case 4:
					int dPos = 0;
					System.out.println("Enter Item's Position to be deleted: ");
					dPos = sc.nextInt();
					removeGroceryItem(dPos);
					break;
					
				case 5:
					String checkItem;
					System.out.println("Enter Item to check whether it is present or not in the Grocery List: ");
					checkItem = sc.next();
					System.out.println(findItem(checkItem));
					break;
				
				case 6:
					System.exit(0);
			}
			
		}
	}
	
}
