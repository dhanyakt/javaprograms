package com.dhanya.thread;

public class Account {
	private int balance = 50;

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public void withdraw(int amt) {
		balance = balance - amt;
		
	}
	
	
	

}
