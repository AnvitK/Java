package com.java.arraysListsAutoUnboxing;

import java.util.Arrays;
import java.util.Scanner;

public class DescendingArray {

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
	
	public static int[] sortArrByDescendingOrder(int [] arr) {
		
//		int[] sortArrDescend = new int[arr.length];
//		for(int i=0;i<arr.length;i++)
//		{									// 1 way of copying one array to another
//			sortArrDescend[i] = arr[i];
//		}
//		
		int[]  sortArrDescend = Arrays.copyOf(arr, arr.length);
		
		for(int i=0;i<sortArrDescend.length-1;i++)
		{   
			int flag=0;
			for(int j=0;j<sortArrDescend.length-i-1;j++)
			{
				if(sortArrDescend[j]<sortArrDescend[j+1])
				{
					int temp  = sortArrDescend[j];
					sortArrDescend[j] = sortArrDescend[j+1];
					sortArrDescend[j+1] = temp;
					flag=1;
				}
			}
			if(flag==0)
				break;
		}
		return sortArrDescend;
	}
	
	public static void main(String[] args) {
	
		int n;
		System.out.println("Enter array size: ");
		n=sc.nextInt();
		int[] arr = new int[n];
		inputArr(arr);
		printArr(arr);
		int[] newArr = sortArrByDescendingOrder(arr);
		printArr(newArr);
	}
	
}
