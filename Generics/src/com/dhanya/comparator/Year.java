package com.dhanya.comparator;

import java.util.Comparator;

import com.dhanya.generics.TvSeries;

public class Year implements Comparator<TvSeries> {
	
	@Override
	public int compare(TvSeries o1, TvSeries o2) {
		return o1.getYear().compareTo(o2.getYear());
	}

}
