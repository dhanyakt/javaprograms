package com.dhanya.collections;

public class Dog {
	public String name;
	
	public Dog(String n){
		name = n;
	}
	
	@Override
	public boolean equals(Object o) {
		if((o instanceof Dog) && (((Dog)o).name == name)){
			System.out.println("its true");
			return true;
		}
		System.out.println("its false");
		return false;
	}

	
	@Override
	public int hashCode() {
		return name.length();
	}
	
	public int hashcode(){
		return 4;
	}
	
	
	enum Pets {DOG,CAT,HORSE}
	
	}


	
	


