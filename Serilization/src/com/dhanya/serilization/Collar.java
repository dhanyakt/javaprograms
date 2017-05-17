package com.dhanya.serilization;

import java.io.Serializable;

public class Collar implements Serializable {
	private int collarSize;
	
	public Collar(int size){
		collarSize = size;
	}

	public int getCollarSize() {
		return collarSize;
	}

	public void setCollarSize(int collarSize) {
		this.collarSize = collarSize;
	}

	@Override
	public String toString() {
		return "Collar [collarSize=" + collarSize + "]";
	}
	
	
	

}
