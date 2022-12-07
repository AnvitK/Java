package com.java.musicPlayer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Album {

	private String name;
	private String artist;
	private ArrayList<Song> songs;
	
	public Album(String name, String artist) {
//		super();
		this.name = name;
		this.artist = artist;
		this.songs = new  ArrayList<Song>();
	}
	
	public boolean addSong(String title, double duration) {
		if(findSong(title) == null) {
			this.songs.add(new Song(title, duration));
			return true;
		}
		return false;
	}
	
	private Song findSong(String title) {
		for(Song checkedSong : songs) {  // for each loop
			if(checkedSong.getTitle().equals(title)) {
				return checkedSong;
			}
		}
		return null;
	}
	
	public boolean addToPlayList(int trackNo, List<Song> playList) {
		int idx = trackNo - 1;
	    if((idx >= 0) && (idx < this.songs.size())) {
	    	playList.add(this.songs.get(idx));
	    	return true;
	    }
	    else {
	    	System.out.println("This album does not have a track " + trackNo);
	    	return false;
	    }
	}
	
	public boolean addToPlayList(String title, List<Song> playList) {
		Song checkedSong = findSong(title);
		if(checkedSong != null) {
			playList.add(checkedSong);
			return true;
		}
		else {
			System.out.println("This song " + title + " is not present in the album");
	    	return false;
		}
	}
	
}
