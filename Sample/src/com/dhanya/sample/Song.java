package com.dhanya.sample;

import java.util.Comparator;

public class Song implements Comparator<Song>{
	private String title;
	private String artist;
	private String rating;
	private String bpm;
	
	
	/*@Override
	public int compareTo(Song s) {
		// TODO Auto-generated method stub
		return artist.compareTo(getArtist());
	}
	*/
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	public String getBpm() {
		return bpm;
	}
	public void setBpm(String bpm) {
		this.bpm = bpm;
	}
	@Override
	public int compare(Song o1, Song o2) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	

}
