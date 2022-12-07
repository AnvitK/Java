package com.java.autoUnboxing;

import java.util.ArrayList;

public class AutoUnboxiing {
	
	public static void main(String[] args) {
		String [] strArr = new String[10];
		int [] intArr = new int[10];
		
		ArrayList<String> strListArr = new ArrayList<String>();
		strListArr.add("Anvit");
		
//		ArrayList<int> intListArr = new ArrayList<int>(); error primitive data type not allowed only classes and objects allowed in ArrayList
		
		ArrayList<IntClass> intListArr = new ArrayList<IntClass>();
		intListArr.add(new IntClass(678));
		
		Integer intNo = new Integer(45);
		Double doNo = new Double(466.23);
		
//		ArrayList<Integer> intListArr1 = new ArrayList<Integer>();
//		for(int i=0;i<=10;i++) {
////			intListArr1.add(i);
//			intListArr1.add(Integer.valueOf(i)); // auto boxing converts primitive i into Class Integer i
//		}
//		
//		System.out.println(intListArr1);
//		
//		for(int i=0;i<=10;i++) {
//			System.out.println(i + " ==> " + intListArr1.get(i).intValue());  // unboxing converts Class Integer i into  primitive i  
//		}
		
		Integer intNo1 = 48; // complie time  -> Integer.valueOf(48)
		Double doNo1 = 789.578;  // complie time  -> Double.valueOf(789.578)
		
		int intNo2 = intNo1;  // complie time  -> intNo1.intvalueOf()
		
	
	
		ArrayList<Double> doubleListArr = new ArrayList<Double>();
		for(double i1=0.0;i1<=10.0;i1=i1+0.5) {
			doubleListArr.add(Double.valueOf(i1)); // auto boxing converts primitive i into Class Double i
		}
		
		System.out.println(doubleListArr);
		
		for(int i=0;i<doubleListArr.size();i++) {
			System.out.println(i + " ==> " + doubleListArr.get(i).doubleValue());  // unboxing converts Class Double i into  primitive i  
		}
		
	}
}
