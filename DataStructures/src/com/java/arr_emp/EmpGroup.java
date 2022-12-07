package com.java.arr_emp;

import java.util.Scanner;

public class EmpGroup {

//	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of employees: ");
		int n = sc.nextInt();
		
		Employee arr[] = new Employee[n];
		
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter employee id: ");
			int id = sc.nextInt();
			System.out.println("Enter employee name: ");
			String name = sc.next();
			
			arr[i] = new Employee(id, name);
		}
		
		System.out.println("The employees data is: ");
		
		for(int i=0;i<n;i++)
		{
			arr[i].displayData();
		}
	}

}
