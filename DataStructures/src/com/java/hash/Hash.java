package com.java.hash;

import java.util.ArrayList;
import java.util.LinkedList;

public class Hash {
	
	int bucket;
	ArrayList<LinkedList<Integer>> table;
	
	Hash(int b)
	{
		bucket = b;
		table = new ArrayList<LinkedList<Integer>>();
		for(int i=0;i<bucket;i++)
		{
			table.add(new LinkedList<Integer>());
		}
	}
	
	public void insert(int key)
	{
		int i = key % bucket;
		table.get(i).add(key);
	}
	
	public boolean search(int key)
	{
		int i = key % bucket;
		return table.get(i).contains(key);
	}
	
	public void delete(int key)
	{
		int i = key % bucket;
		table.get(i).remove(key);
	}
	
}
