package com.java.musicPlayer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Album {

	private String name;
	private String artist;
	private SongList songs;
	
	public Album(String name, String artist) {
		super();
		this.name = name;
		this.artist = artist;
		this.songs = new  SongList();
	}
	
	public boolean addSong(String title, double duration) {
		return this.songs.addSong(new Song(title, duration));
	}
	
//	private Song findSong(String title) {
//		for(Song checkedSong : songs) {  // for each loop
//			if(checkedSong.getTitle().equals(title)) {
//				return checkedSong;
//			}
//		}
//		return null;
//	}
	
	public boolean addToPlayList(int trackNo, List<Song> playList) {
		Song checkedSong = this.songs.findSong(trackNo);
	    if(checkedSong != null) {
	    	playList.add(checkedSong);
	    	return true;
	    }
	    else {
	    	System.out.println("This album does not have a track " + trackNo);
	    	return false;
	    }
	}
	
	public boolean addToPlayList(String title, List<Song> playList) {
		Song checkedSong = this.songs.findSong(title);
		if(checkedSong != null) {
			playList.add(checkedSong);
			return true;
		}
		else {
			System.out.println("This song " + title + " is not present in the album");
	    	return false;
		}
	}
	
	private class SongList{
		private ArrayList<Song> songs;
		
		public SongList() {
			this.songs = new ArrayList<Song>();
		}
		
		public boolean addSong(Song song) {
			if(songs.contains(song)) {
				return false;
			}
			this.songs.add(song);
			return true;
		}
		
		private Song findSong(String title) {
			for(Song checkedSong : songs) {  // for each loop
				if(checkedSong.getTitle().equals(title)) {
					return checkedSong;
				}
			}
			return null;
		}
		
		public Song findSong(int trackNo) {
			int idx = trackNo - 1;
		    if((idx >= 0) && (idx < this.songs.size())) {
		    	return songs.get(idx);
		    }
		    	return null;    
		}
	}
	
	
}
