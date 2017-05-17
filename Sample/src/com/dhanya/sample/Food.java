package com.dhanya.sample;

public class Food {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Fruit  fruitOne = new Fruit();
		Fruit  fruitTwo = new Fruit();
		fruitOne.setName("Mango");
		fruitOne.setColor("yellow");
		fruitTwo.setName("Mango");
		fruitTwo.setColor("green");
		
		fruitOne= fruitTwo;
		
		System.out.println("Print hashcode " + fruitOne.hashCode());
		System.out.println("Print hashcode " + fruitTwo.hashCode());
		

	}

}
