package com.dhanya.calendar;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

public class FormatEx {

	public static void main(String[] args) {
		// Getting current date and time.
		
		Date d = new Date();
		String s = d.toString();
		System.out.println(s);
		
		
		//Object lets to perform date and time calculation in locale
		Calendar cal = Calendar.getInstance();
		cal.add(4, 5);
		DateFormat df = DateFormat.getDateInstance(DateFormat.FULL);
		System.out.println(df.format(d));
		DateFormat dfs = DateFormat.getDateInstance();
		System.out.println(dfs.format(d));
		
		
		
	}

}
