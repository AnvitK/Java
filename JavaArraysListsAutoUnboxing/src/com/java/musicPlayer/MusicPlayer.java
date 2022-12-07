package com.java.musicPlayer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class MusicPlayer {

	private static List<Album> albums = new ArrayList<Album>();
	
	public static void main(String[] args) {
		
		Album album = new Album("Star Boy", "The Weeknd");
		album.addSong("Star Boy", 3.5);
		album.addSong("False Alarm", 3.4);
		album.addSong("Rockin", 3.52);
		album.addSong("True Colors", 3.26);
		album.addSong("Party Monster", 4.09);
		album.addSong("Reminder", 3.38);
		album.addSong("Secrets", 4.25);
		album.addSong("Stargirl Interlude", 1.51);
		albums.add(album);
		
		album = new Album("Dark Lane Demo Tapes", "Drake");
		album.addSong("Depp Pockets", 3.43);
		album.addSong("Chicago Freestyle", 3.41);
		album.addSong("Toosise Slide", 4.07);
		album.addSong("Time Flies", 3.13);
		album.addSong("When To Say When", 3.43);
		album.addSong("Not You Too", 4.30);
		album.addSong("Desires", 3.58);
		album.addSong("Landed", 2.32);
		albums.add(album);
		
		List<Song> playList = new ArrayList<Song>();
		albums.get(0).addToPlayList("Stargirl Interlude", playList);
		albums.get(0).addToPlayList("Rockin", playList);
		albums.get(0).addToPlayList("Stargirl", playList);
		albums.get(0).addToPlayList(5, playList);
		albums.get(1).addToPlayList(3, playList);
		albums.get(1).addToPlayList(6, playList);
		albums.get(1).addToPlayList(1, playList);
		albums.get(1).addToPlayList(10, playList);
	
		play(playList);
	
	}

	private static void play(List<Song> playList) {
		Scanner sc = new Scanner(System.in);
		boolean quit = false, fwd = true;
		ListIterator<Song> listIterator = playList.listIterator();
		if(playList.size() == 0) {
			System.out.println("No songs in the playlist");
			return;
		}
		else {
			System.out.println("Now playing: " + listIterator.next().toString());
			printMenu();
		}
		
		while(!quit) {
			int choice  = sc.nextInt();
			sc.nextLine();
			
			switch(choice) {
				case 0:
					System.out.println("Playlist complete");
					quit = true;
					break;
				case 1:
					if(!fwd) {
						if(listIterator.hasNext()) {
							listIterator.next();
						}
						fwd = true;
					}
					if(listIterator.hasNext()) {
						System.out.println("Now playing: " + listIterator.next().toString());
					}
					else {
						System.out.println("We have reached the end of the playlist");
						fwd = false;
					}
					break;
				case 2:
					if(fwd) {
						if(listIterator.hasPrevious()) {
							listIterator.previous();
						}
						fwd = false;
					}
					if(listIterator.hasPrevious()) {
						System.out.println("Now playing: " + listIterator.previous().toString());
					}
					else {
						System.out.println("We have reached the start of the playlist");
						fwd = true;
					}
					break;
				case 3:
					if(fwd) {
						if(listIterator.hasPrevious()) {
							System.out.println("Now replaying: " + listIterator.previous().toString());
							fwd = false;
						} else {
							System.out.println("We have reached the start of the playlist");
						}
					} else {
						if(listIterator.hasNext()) {
							System.out.println("Now replaying: " + listIterator.next().toString());
							fwd = true;
						} else {
							System.out.println("We have reached the end of the playlist");
						}
					}
					break;
				case 4:
					printList(playList);
					break;
				case 5:
					if(playList.size() > 0) {
						listIterator.remove();
						if(listIterator.hasNext()) {
							System.out.println("Now playing: " + listIterator.next().toString());
						} else if(listIterator.hasPrevious()) {
							System.out.println("Now playing: " + listIterator.previous().toString());
						}
					}
					break;
				case 6:
					printMenu();
					break;
			}
		}
		
	}
	
	private static void printMenu() {
		System.out.println("Available actions: \npress");
		System.out.println("0 - quit\n"
				+ "1 - play next song\n"
				+ "2 - play previous song\n"
				+ "3 - to replay the current song\n"
				+ "4 - list songs in the playlist\n"
				+ "5 - delete current song from the playList\n"
				+ "6 - print the available actions.");
	}
	
	private static void printList(List<Song> playList) {
		Iterator<Song> iterator = playList.iterator();
		System.out.println("==================================");
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("==================================");
	}
	
}
