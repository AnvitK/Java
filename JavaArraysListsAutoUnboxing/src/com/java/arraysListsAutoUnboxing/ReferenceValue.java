package com.java.arraysListsAutoUnboxing;

import java.util.Arrays;

public class ReferenceValue {

	public static void modifyArr(int arr[])
	{
		
		arr[1] = 4;
		arr = new int[] {33,466,68};
	}
	
	
	public static void main(String[] args) {
		int v1 = 25;
		int v2 = v1; // Value wise copy
		
		System.out.println("V1 = "+v1+" V2 = "+v2);
		
		v2--;
		
		System.out.println("V1 = "+v1+" V2 = "+v2);
		
		int[] arr1 = new int[5];
		int[] arr2 = arr1; // Reference wise copy
		
		System.out.println("Arr1 : " +Arrays.toString(arr1));
		System.out.println("Arr2 using ref of Arr1: " +Arrays.toString(arr2));

		arr2[3] = 26;
		
		System.out.println("Arr1 using ref but change in arr2[3]: " +Arrays.toString(arr1));
		System.out.println("Arr2 using ref but change in arr2[3]: " +Arrays.toString(arr2));
		
		modifyArr(arr2);
		
		System.out.println("Arr1 using ref but change in arr2[1] via modfyarr method: " +Arrays.toString(arr1));
		System.out.println("Arr2 using ref but change in arr2[1] via modfyarr method: " +Arrays.toString(arr2));
		
		arr2 = new int[] {1,2,3,4,5};
		
		System.out.println("Arr1 using ref but change in arr2 via new keyword: " +Arrays.toString(arr1));
		System.out.println("Arr2 using ref but change in arr2 via new keyword: " +Arrays.toString(arr2));
		
	}

}
