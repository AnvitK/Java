package com.java.collection;

import java.util.*;


public class Theatre {
	
	private final String theatreName;
//	private Collection<Seat> seats = new LinkedList<>();
//	private Collection<Seat> seats = new HashSet<>();    // unordered
//	private Collection<Seat> seats = new LinkedHashSet<>();     // ordered
	public List<Seat> seats = new ArrayList<>();
	
	static final Comparator<Seat> PRICE_ORDER = new Comparator<Seat>() {
		@Override
		public int compare(Seat  seat1, Seat seat2) {
			if(seat1.getPrice() < seat2.getPrice()) {
				return -1;
			} else if(seat1.getPrice() > seat2.getPrice()) {
				return 1;
			} else {
				return 0;
			}
		}
	};
	
//	static final Comparator<Seat> PRICE_ORDER = new Comparator<Seat>() {
//		
//	}
//	
	public Theatre(String theatreName, int noRows, int seatPerRow) {
		this.theatreName = theatreName;
		
		int lastRow = 'A' + (noRows - 1);
		
		for(char row = 'A'; row <= lastRow; row++) {
			for(int seatNo = 1; seatNo <= seatPerRow; seatNo++) {
				double price  = 150;
				
				if((row < 'D') && (seatNo >= 4 && seatNo <= 9)) {      // inside the box
					price = 200;
				} else if((row > 'F') || (seatNo < 4 || seatNo > 9)) {    // for outer box seats
					price = 100;
				}
				Seat seat = new Seat(row + String.format("%02d", seatNo), price);
				seats.add(seat);
			}
		}
		
	}

	public String getTheatreName() {
		return theatreName;
	}

	
	public boolean reserveSeat(String seatNo) {
		Seat requestSeat = new Seat(seatNo, 0);
		int foundSeat = Collections.binarySearch(seats, requestSeat, null);  // Binary Search
		if(foundSeat >= 0) {
			return seats.get(foundSeat).reserve();
		}
		else {
			System.out.println("There is no seat with seat number "+ seatNo);
			return false;
		}
//		for(Seat seat: seats) {
//			if(seat.getSeatNo().equals(seatNo)) {
//				requestSeat = seat;
//				break;
//			}
//		}
//		
//		if(requestSeat == null) {
//			System.out.println("There is no seat with seat number "+ seatNo);
//			return false;
//		}
//		
//		return requestSeat.reserve(); 
	}
	
	public Collection<Seat> getSeats() {
		return seats;
	}
	
	public class Seat implements Comparable<Seat>{

		private final String seatNo;
		private double price;
		private boolean reserved = false;
		
		public Seat(String seatNo, double price) {
			this.seatNo = seatNo;
			this.price = price;
		}
		
		public String getSeatNo() {
			return seatNo;
		}
		
		public double getPrice() {
			return price;
		}

		public boolean reserve() {
			if(!this.reserved) {
				this.reserved = true;
				System.out.println("Seat " + this.seatNo + " is reserved");
				return true;
			}
			else {
				return false;
			}
		}
			
		public boolean cancel() {
			if(this.reserved) {
				this.reserved = false;
				System.out.println("Reservation of seat " + this.seatNo + " is cancelled");
				return true;
			}else {
				return false;
			}
		}

		@Override
		public int compareTo(Seat anotherSeat) {
			return this.seatNo.compareToIgnoreCase(anotherSeat.getSeatNo());
		}

	}

}
