package com.dhanya.array;

public class Shirt {
	private  int shirtId;
	private String desc;
	private char color_code;
	private double prices;
	

	
	public Shirt(int shirtID,String description, char colorCode, double price){
		shirtId = shirtID;
		desc = description;
		color_code = colorCode;
		prices = price;
	}

	public void displayShirtInformation(Shirt[] myShirt) {
		// TODO Auto-generated method stub
		for(int i =0; i< myShirt.length; i++){
			System.out.println("Shirt information are:" + myShirt[i].shirtId + myShirt[i].color_code + myShirt[i].desc+ myShirt[i].prices);
		}
		
	}

}
