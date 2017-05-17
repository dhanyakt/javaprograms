package com.dhanya.generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

import com.dhanya.comparator.Year;

public class Testing {
	
	ArrayList<TvSeries> shows = new ArrayList<TvSeries>();

	public static void main(String[] args) {
		Testing t = new Testing();
		t.addShows();
		Storing s = new Storing();
		s.getShows();
		
		
	}


	private void addShows() {
		TvSeries show1 = new TvSeries("the middle", "Sue Heck", "2015");
		TvSeries show2 = new TvSeries("friends", "monica", "2009");
		TvSeries show = new TvSeries("everbody loves raymond", "raymond", "2013");
		shows.add(show);
		shows.add(show1);
		shows.add(show2);
		
		Collections.sort(shows);
		
		System.out.println(shows);
		
	}

}
