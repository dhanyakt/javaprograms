package com.dhanya.generics;

public class Song  implements Comparable<Song>{
	private String title;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public int compareTo(Song song) {
		// TODO Auto-generated method stub
		return title.compareTo(song.getTitle());
	}

	
	public String getTitle() {
		return title;
	}

	
	public void setTitle(String title) {
		this.title = title;
	}

	

	
}
