package com.java.adventure;

import java.util.*;

public class Location {

	private final int locationID;
	private final String description;
	private final Map<String, Integer> exits;
	
	public Location(int locationID, String description, Map<String, Integer> exits) {
		this.locationID = locationID;
		this.description = description;
		this.exits = new HashMap<String, Integer>(exits);
		this.exits.put("Q", 0);
	}

	public int getLocationID() {
		return locationID;
	}

	public String getDescription() {
		return description;
	}

	public Map<String, Integer> getExits() {
		return new HashMap<String, Integer>(exits);
	}
	
//	public void addExit(String dir, int loc) {
//		exits.put(dir, loc);
//	}
	
	
}
