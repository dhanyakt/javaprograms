package com.dhanya.examples;

public class Vehicle {
	
	public String name;
	public String color;
	public int weight;
	
	/*public Vehicle(String str) {
		System.out.println("Print the name of the vehicle");
	}*/
	
	public Vehicle() {
		System.out.println("Vehicle: constructor");
	}
	
	public void name(){
		System.out.println("Print the name of the vehicle");
	}
	
	public void color(){
		System.out.println("Print the color of the vehicle");
	}
	public void size(){
		System.out.println("Print the size of the vehicle");
	}
	
	public static void ride(){
		System.out.println("driving is ok !!!!!!!!!!!!");
	}


	
	
public static void main(String[] args){
	
	//Vehicle v = new Vehicle();
	//Toyota t = new Toyota();
	  Vehicle v = new Toyota("blue");
	  v.size();
	  v.name();
	  v.color();
	  
	  System.out.println(v.color);
	  
	  ride();
	  Vehicle v1 = new Mazda();	
	  Ford f = new Ford("black");
	  
	
	
	}

}