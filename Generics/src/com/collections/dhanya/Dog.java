package com.collections.dhanya;

public class Dog {
	
	public String name;

	public Dog(String name) {
		super();
		this.name = name;
	}
	@Override
	public boolean equals(Object o) {
		if((o instanceof Dog) && (((Dog)o).name == name)){
			return true;
		} else {
			return false;
		}
	}
	@Override
	public int hashCode() {
		return name.length();
	}
	
	
	
	
	
	

}
