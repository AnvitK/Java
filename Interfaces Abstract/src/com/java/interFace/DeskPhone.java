package com.java.interFace;

public class DeskPhone implements ITelephone {

	private int myNo;
	private boolean isRinging;
	
	public DeskPhone(int myNo) {
		this.myNo = myNo;
	}

	@Override
	public void powerOn() {
		System.out.println("Desk Phone does not have a power button");
		
	}

	@Override
	public void dial(int phNo) {
		System.out.println("Now Ringing " + phNo + " on desk phone");
		
	}

	@Override
	public void answer() {
		if(isRinging) {
			System.out.println("Answering the desk phone ");
			isRinging = false;
		}
		
	}

	@Override
	public boolean callPhone(int phNo) {
		if(phNo == myNo) {
			isRinging = true;
			System.out.println("Ring Ring");
		}
		else {
			isRinging = false;
		}
		return isRinging;
	}

	@Override
	public boolean isRinging() {
		return isRinging;
	}

}
