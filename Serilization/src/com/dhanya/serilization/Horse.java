package com.dhanya.serilization;

import java.io.Serializable;

public class Horse extends Animal implements Serializable  {
	public String name;
	
	
	public Horse(int w, String n){
		weight = w;
		name = n;
	}
	
	public void go(){
		System.out.println(weight);
	}
	
	
}
