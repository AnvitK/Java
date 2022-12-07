package com.java.inner;

import java.util.Scanner;

public class UseButton {
	
	private static Scanner sc = new Scanner(System.in);
	private static Button btnPrint = new Button("Print");

	public static void main(String[] args) {
		
//		class ClickListener implements Button.OnClickListener{  // local class
//			public ClickListener() {
//				System.out.println("I have been attached");
//			}
//
//			@Override
//			public void onClick(String title) {
//				System.out.println(title + " was clicked");
//			}
//		}
//		
//		btnPrint.setOnClickListener(new ClickListener());
		
		btnPrint.setOnClickListener(new Button.OnClickListener() {    // anonyms inner class 
			@Override
			public void onClick(String title) {
				System.out.println(title + " was clicked");
			}
		});
		
		listen();
	}

	private static void listen() {
		boolean quit = false;
		while(!quit) {
			int ch = sc.nextInt();
			switch(ch) {
				case 0:
					quit = true;
					break;
				case 1:
					btnPrint.onClick();
					break;
			}
		}
	}
	
	
}
