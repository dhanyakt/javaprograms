package com.dhanya.serilization;

import java.io.Serializable;

public class Dog implements Serializable {
	private  Collar theCollar;
	private int dogSize;
	
	public Dog(Collar collar,int size){
		theCollar = collar;
		dogSize = size;
	}

	public Collar getTheCollar() {
		return theCollar;
	}
	
	public void setTheCollar(Collar theCollar) {
		this.theCollar = theCollar;
	}

	public int getDogSize() {
		return dogSize;
	}
	
	public void setDogSize(int dogSize) {
		this.dogSize = dogSize;
	}

	
	/*@Override
	public String toString() {
		return "Dog [theCollar=" + theCollar + ", dogSize=" + dogSize + "]";
	}*/
	
	
}






