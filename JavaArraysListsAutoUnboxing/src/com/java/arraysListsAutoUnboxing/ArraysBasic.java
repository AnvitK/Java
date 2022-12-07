package com.java.arraysListsAutoUnboxing;

public class ArraysBasic {
	
	public static void printArr(int[] arr) {
		for(int i=0;i < arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	
	
	public static void main(String[] args) {
		
		int[] arr1;           // Array declaration 1st way
		arr1 = new int[10];
		
		int[] arr2 = new int[10];	// Array declaration 2nd way
		
		arr1[4] = 13;
		arr2[6] = 56;
		
		double[] arr3 = new double[15];
		arr3[2] = 23.567;
		
		char[] chArr = {'A','a','b','c','O'};
		
		System.out.println(arr1[4]+" "+arr2[6]+" "+arr3[2]);
		System.out.println(chArr);
		
		int arr4[] = new int[10];
		for(int i=0;i<10;i++)
		{
			arr4[i] = i;
		}

		printArr(arr4);
		
		System.out.println();
		for(int i=0;i < chArr.length; i++)
		{
			System.out.print(chArr[i]+" ");
		}
	}

}
