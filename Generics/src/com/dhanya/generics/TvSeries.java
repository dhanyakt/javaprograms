package com.dhanya.generics;

import java.util.Comparator;

public class TvSeries implements Comparable<TvSeries>{
	String title;
	String main_aactor;
	String year;
	
	
	
	public TvSeries(String title, String main_aactor, String year) {
		super();
		this.title = title;
		this.main_aactor = main_aactor;
		this.year = year;
	}

	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getMain_aactor() {
		return main_aactor;
	}
	
	public void setMain_aactor(String main_aactor) {
		this.main_aactor = main_aactor;
	}
	
	public String getYear() {
		return year;
	}
	
	public void setYear(String year) {
		this.year = year;
	}

	
	@Override
	public String toString() {
		//System.out.println("Print TvSeries: " + title + " /" + main_aactor + "/ " + year );
		return "TvSeries [title=" + title + ", main_aactor=" + main_aactor
				+ ", year=" + year +  "]" ;
		
		
	}

	

	@Override
	public int compareTo(TvSeries t) {
		
		return title.compareTo(getTitle());
	}

	
	
	
	
	
	
}