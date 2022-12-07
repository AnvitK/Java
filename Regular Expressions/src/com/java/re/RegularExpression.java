package com.java.re;

public class RegularExpression {
	
	public static void main(String[] args) {
	
		String str1 = "My name is Anvit Kamble. My favorite game is BGMI";
		System.out.println(str1);
		String str2 = str1.replaceAll("My", "I");
		System.out.println(str2);
		
		String alphaNum = "abjjfafamnfk5463zzcca";
		System.out.println(alphaNum.replaceAll(".", "Y")); // . is wildcard matches every char
		
		System.out.println(alphaNum.replaceAll("^abjjfa", "XXX")); // ^ start of the string
		
		String alphaNum2 = "abjjfafamnfk5463abjjfazzcca";
		System.out.println(alphaNum2.replaceAll("^abjjfa", "XXX"));  // ^ start of the string
		
		System.out.println(alphaNum.matches("^hello"));  // op - false
		System.out.println(alphaNum.matches("^abjjfa")); // op - false should match the whole string not just some starting or substring
		System.out.println(alphaNum.matches("^abjjfafamnfk5463zzcca")); // op - true
		 
		System.out.println(alphaNum.replaceAll("zzcca$", "THE END"));  // $ end of the string
		System.out.println(alphaNum.replaceAll("[am4c]", "Q")); // [] replaces all the occurences of the chars present in [] with the qiven char value
		System.out.println(alphaNum.replaceAll("[am4c]", "I'm replaced here"));
		System.out.println(alphaNum.replaceAll("[am4c][bn]", "Q"));  // [am4c][bn] --> following
	
		System.out.println("Harry".replaceAll("[Hh]arry", "Harry"));
		System.out.println("harry".replaceAll("[Hh]arry", "Harry"));
		
		System.out.println(alphaNum.replaceAll("[^jf]", "Z"));
		System.out.println(alphaNum.replaceAll("[abcdef12345]", "X"));
		System.out.println(alphaNum.replaceAll("[a-f2-5]", "X"));
		System.out.println("abjjfafaMnFk5463zzcca".replaceAll("[a-fI-N2-5]", "Z"));
	}
	
}
