package com.java.arraysListsAutoUnboxing;

import java.util.Scanner;

public class MinEleRevArr {
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void inputArr(int [] arr) {
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter Element: ");
			arr[i] = sc.nextInt();
		}
	}
	
	
	public static void printArr(int [] arr) {
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	
	public static int minEleArr(int [] arr) {	
		
		int res=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]<res)
				res=arr[i];
		}
		
		return res;
	}

	public static void revArr(int[] arr)
	{
		int s=0,e=arr.length-1;
		while(s<e)
		{
			int temp = arr[e];
			arr[e] = arr[s];
			arr[s] = temp;
			s++;
			e--;
		}
	}
	
	public static void main(String[] args) {
		
		int n;
		System.out.println("Enter array size: ");
		n=sc.nextInt();
		int[] arr = new int[n];
		inputArr(arr);
		System.out.println("Original array is ");
		printArr(arr);
		System.out.println("Minimum element is "+ minEleArr(arr));
		revArr(arr);
		System.out.println("Reverse array is ");
		printArr(arr);
	}
}
