package com.dhanya.banking;

public class TestAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account = new Account(100.0);
		account.deposit(50.0);
		System.out.println("Print the account amount :" + account.getBalance());
		account.withdraw(151.0);
		System.out.println("Final balance amount :" + account.getBalance());
	}
	
	
}
