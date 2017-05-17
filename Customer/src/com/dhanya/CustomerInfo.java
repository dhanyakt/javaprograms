package com.dhanya;

public class CustomerInfo {
	public int customer_id;
	public char status;
	public double totalPurchase;
	
	public void displayCustomerInfo(){
		
		System.out.println("Purchase are" +" "+  customer_id + " " + status + " " + totalPurchase);
	}

}
