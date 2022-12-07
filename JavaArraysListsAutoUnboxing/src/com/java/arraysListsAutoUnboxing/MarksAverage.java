package com.java.arraysListsAutoUnboxing;

import java.util.Scanner;

public class MarksAverage {

	private static Scanner sc = new Scanner(System.in);
	
	public static void inputMarks(int[] marks)
	{
		for(int i=0;i<marks.length;i++)
		{
			System.out.println("Enter mark of student"+(i+1)+": ");
			marks[i] = sc.nextInt();
		}
	}
	
	public static void printMarks(int[] marks)
	{
		for(int i=0;i<marks.length;i++)
		{
			System.out.println("Mark of student"+(i+1)+": "+marks[i]);
		}
	}
	
	public static void sumAvg(int [] arr)
	{
		int sum=0;
		double avg=0.0;
		for(int i=0;i<arr.length;i++)
		{
			sum = sum + arr[i]; 
		}
		avg = sum/arr.length;
		System.out.println("Total Sum: "+sum+" and average: "+avg);
	}
	
	public static void main(String[] args) {
		
		int n;
		System.out.println("Enter number of students: ");
		n=sc.nextInt();
		int[] marks = new int[n];
		inputMarks(marks);
		printMarks(marks);
		sumAvg(marks);

	}

}
