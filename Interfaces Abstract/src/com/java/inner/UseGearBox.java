package com.java.inner;

public class UseGearBox {

	public static void main(String[] args) {
		
		Gearbox ferrari = new Gearbox(6);
//		Gearbox.Gear first = ferrari.new Gear(1, 13.4);
////		Gearbox.Gear second = new Gearbox.Gear(2, 16.6);
////		Gearbox.Gear third = new ferrari.Gear(3, 18.8);
//		System.out.println(first.driveSpeed(1000));
		
		
//		ferrari.addGear(1, 5.7);
//		ferrari.addGear(2, 10.7);
//		ferrari.addGear(3, 16.4);
		ferrari.operateClutch(true);
		ferrari.changeGear(1);
		ferrari.operateClutch(false);
		System.out.println(ferrari.wheelSpeed(1000));
		ferrari.changeGear(2);
		System.out.println(ferrari.wheelSpeed(3000));
		ferrari.operateClutch(true);
		ferrari.changeGear(3);
		ferrari.operateClutch(false);
		System.out.println(ferrari.wheelSpeed(6000));
		
	}

}
