package com.java.interFace;

public class UseDeskMobilePhone {

	public static void main(String[] args) {
	
		ITelephone anvitPhone;
		anvitPhone = new DeskPhone(123456);
		anvitPhone.powerOn();
		anvitPhone.callPhone(123456);
		anvitPhone.answer();

		anvitPhone = new MobilePhone(223445);
		anvitPhone.powerOn();
		anvitPhone.callPhone(223445);
		anvitPhone.answer();
		
		
	}

}
