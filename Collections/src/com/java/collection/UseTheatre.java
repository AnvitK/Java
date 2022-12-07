package com.java.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.java.collection.Theatre.Seat;

public class UseTheatre {

	public static void main(String[] args) {
		
		Theatre cinemax = new Theatre("Cinemax", 8, 12);
//		cinemax.getSeats();
		
//		if(cinemax.reserveSeat("G10")) {
//			System.out.println("Please pay");
//		}else {
//			System.out.println("Sorry, seat is taken");
//		}
//		
//		if(cinemax.reserveSeat("G10")) {
//			System.out.println("Please pay");
//		}else {
//			System.out.println("Sorry, seat is taken");
//		}
		
//		List<Theatre.Seat> seatListCopy = new ArrayList<>(cinemax.seats);
//		printList(seatListCopy);
//		
//		seatListCopy.get(1).reserve();
		if(cinemax.reserveSeat("D12")) {
			System.out.println("Please pay");
		}else {
			System.out.println("Sorry, seat is taken");
		}
		if(cinemax.reserveSeat("D12")) {
			System.out.println("Please pay");
		}else {
			System.out.println("Sorry, seat is taken");
		}
		printList(cinemax.seats);
		
		List<Theatre.Seat> revSeats = new ArrayList<>(cinemax.getSeats());
		Collections.reverse(revSeats);
		printList(revSeats);
		
		List<Theatre.Seat> priceSeats = new ArrayList<>(cinemax.getSeats());
		priceSeats.add(cinemax.new Seat("B00", 130));
		priceSeats.add(cinemax.new Seat("A00", 130));
		Collections.sort(priceSeats, cinemax.PRICE_ORDER);
		printList(priceSeats);
////		Collections.reverse(seatListCopy);
//		Collections.shuffle(seatListCopy);
//		System.out.println("Printing shuffled seatListCopy: ");
//		printList(seatListCopy);
//		
//		System.out.println("Printing  cinemax.seats: ");
//		printList(cinemax.seats);
//		
//		
//		Theatre.Seat minSeat = Collections.min(seatListCopy);
//		Theatre.Seat maxSeat = Collections.max(seatListCopy);
//		System.out.println("Min seat number is " + minSeat.getSeatNo() + " and Max seat number is "+ maxSeat.getSeatNo());
//		
//		
//		sortList(seatListCopy);
//		System.out.println("Printing sorted seatListCopy: ");
//		printList(seatListCopy);
//		
//		List<Theatre.Seat> newList = new ArrayList<>(cinemax.seats.size());
//		Collections.copy(newList, cinemax.seats);
		
	}

	public static void printList(List<Theatre.Seat> seatList) {
		for(Seat seat : seatList) {
			System.out.print(seat.getSeatNo() + " " + seat.getPrice() + "   ");
		}
		System.out.println("\n===================================================================================================================================");
	}
	
//	public static void sortList(List <? extends Theatre.Seat> list) {
//		for(int i = 0; i < list.size() - 1; i++) {
//			for(int j = i + 1; j < list.size(); j++) {
//				if(list.get(i).compareTo(list.get(j)) > 0) {
//					Collections.swap(list, i, j);
//				}
//			}
//		}
//	}
	
	
}
