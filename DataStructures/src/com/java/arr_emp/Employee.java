package com.java.arr_emp;

public class Employee {

	int id;
	String name;
	
	public Employee(int id, String name)
	{
		this.id = id;
		this.name = name;
	}
	
	public void displayData()
	{
		System.out.println(id+"\t"+name);
	}
	
}
