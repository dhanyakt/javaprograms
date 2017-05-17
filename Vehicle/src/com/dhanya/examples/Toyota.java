package com.dhanya.examples;

public class Toyota extends Vehicle{
	
	String name ="toyota";
	String color = "golden";
	
	Toyota(String tag){
		this();
		System.out.println("Toyota: constructor with arg");
	}
	
	Toyota(){
		//new Toyota("dhanya");
		System.out.println("Toyota: constructor no args");
	}

	@Override
	public void name() {
		System.out.println("Print the car name as Toyota");
	}
	
	public void color(String s){
		s = "golden";
		System.out.println("print " + s);
	}
	
	
}
