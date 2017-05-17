package com.dhanya.calendar;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class CalendarEx {

	public static void main(String[] args) {
		//Calendar c = Calendar.getInstance();
		//c.set(2015, 10, 14 );
		//Date d = c.getTime();
		//System.out.println(d);
		Date date = new Date();
		Locale loc = new Locale("hi","IN");
		Calendar cal = Calendar.getInstance(loc);
		cal.setTime(date);
		Date d = cal.getTime();
		DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT, loc);
		String s = df.format(date);
		System.out.println(s);
		
		
		
		
	}

}
