package com.example.dhanya;

public class Dog {
	
	private int size;
	private String name;
	private int weight;
	
	public int getSize() {
		return size;
	}
	
	public void setSize(int size) {
		this.size = size;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	@Override
	public String toString() {
		return "Dog [size=" + size + ", name=" + name + ", weight=" + weight
				+ "]";
	}

	public void bark() {
		// TODO Auto-generated method stub
		if(name=="Bella")
			System.out.println("Its our dog");
		else {
			System.out.println("Its not our dog");
		}
			
			
		
	}
	


}
