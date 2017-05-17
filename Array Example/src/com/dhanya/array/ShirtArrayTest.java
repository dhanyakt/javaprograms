package com.dhanya.array;

public class ShirtArrayTest {
	 public Shirt[] myShirt;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShirtArrayTest sArrayTest = new ShirtArrayTest();
		sArrayTest.display();
		
		
	}

	private void display() {
		Shirt shirt = new Shirt(1, "Louis ", 'G', 35.5);
		Shirt shirt2 = new Shirt(3, "raymond", 'R', 40);
		Shirt shirt3 = new Shirt(4, "Van", 'V', 34.40);
		myShirt = new Shirt[3];
		myShirt[0] = shirt;
		myShirt[1]= shirt2;
		myShirt[2] = shirt3;
		shirt.displayShirtInformation(myShirt);
		
		
	}

}
