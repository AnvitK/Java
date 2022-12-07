package com.java.inner;

import java.util.ArrayList;

public class Gearbox {
	private ArrayList<Gear> gears;
	private int maxGears;
	private int currGear = 0;
	private boolean clutIsIn;

	public Gearbox(int maxGears) {
		this.maxGears = maxGears;
		this.gears = new ArrayList<Gear>();
		Gear neutral = new Gear(0, 0.0);
		this.gears.add(neutral);
		
		for(int i = 0; i < maxGears; i++) {
			addGear(i, i * 5.3);
		}
	}
	
	public void operateClutch(boolean in) {
		this.clutIsIn = in;
	}
	
	public void addGear(int no, double ratio) {
		if((no > 0) && (no <= maxGears)){
			this.gears.add(new Gear(no, ratio));
		}
	}
	
	public void changeGear(int newGear) {
		if(newGear >= 0 && newGear < this.gears.size() && this.clutIsIn) {
			this.currGear = newGear;
			System.out.println("Gear " + newGear + " is selected.");
		}
		else {
			System.out.println("Grind!!");
			this.currGear = 0;
		}
	}
	
	public double wheelSpeed(int revs) {
		if(clutIsIn) {
			System.out.println("Scream!!!!");
			return 0.0;
		}
		return revs * gears.get(currGear).getRatio();
	}
	
	private class Gear{      // private inner class
		private int gearNo;
		private double ratio;
		
		public Gear(int gearNo, double ratio) {
			this.gearNo = gearNo;
			this.ratio = ratio;
		}
		
		public double driveSpeed(int revs) {
			return revs * (this.ratio);
		}

		public double getRatio() {
			return ratio;
		}
		
	}
}
