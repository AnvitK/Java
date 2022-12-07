package com.java.interFace;

public class MobilePhone implements ITelephone {

	private int myNo;
	private boolean isRinging;
	private boolean isOn = false;
	
	public MobilePhone(int myNo) {
		this.myNo = myNo;
	}

	@Override
	public void powerOn() {
		isOn = true;
		System.out.println("Mobile phone powered up");
		
	}

	@Override
	public void dial(int phNo) {
		if(isOn) {
			System.out.println("Now Ringing " + phNo + " on desk phone");
		}
		else {
			System.out.println("Phone is switched off");
		}
	}

	@Override
	public void answer() {
		if(isRinging) {
			System.out.println("Answering the mobile phone ");
			isRinging = false;
		}
		else {
			System.out.println("Phone is switched off");
		}
	}

	@Override
	public boolean callPhone(int phNo) {
		if(phNo == myNo && isOn) {
			isRinging = true;
			System.out.println("Melody Ring");
		}
		else {
			isRinging = false;
			System.out.println("Phone is switched off or wrong number is dialed");
		}
		return isRinging;
	}

	@Override
	public boolean isRinging() {
		return isRinging;
	}

}
