package com.example.dhanya;

public class ExampleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String value = "x";
		String sample = changeValue(value);
		System.out.println(sample);
		

		Example example = new Example();
		System.out.println(example.name);
		System.out.println(example.success);
		int x = 4;
		int y = 3;
		example.go(x,y);
		
		Dog d = new Dog();
		d.setSize(20);
		d.setName("Bella");
		d.setWeight(45);
		d.bark();
		
		
	
		
		
		
		
	}

	public static String changeValue(String value) {
		return value = "y";
		
		
	}

	

}
