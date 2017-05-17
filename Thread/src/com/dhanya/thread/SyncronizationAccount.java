package com.dhanya.thread;

public class SyncronizationAccount implements Runnable{
	private Account accnt = new Account();

	public static void main(String[] args) {
		SyncronizationAccount s = new SyncronizationAccount();
		Thread t1 = new Thread(s);
		Thread t2 = new Thread(s);
		t1.setName("Fred");
		t2.setName("Lucy");
		t1.start();
		t2.start();

	}

	@Override
	public void run() {
		for(int i = 0 ; i< 5 ; i++){
			makeWithdrawl(10);
			if(accnt.getBalance()<0){
				System.out.println("account is overdrawn");
			}
		}
		
		
	}
	
	private synchronized void makeWithdrawl(int amt){
		if(accnt.getBalance()>= amt){
			System.out.println(Thread.currentThread().getName() + " is going to make withdrawal");
		try{
			Thread.sleep(500);
		}
		 catch(InterruptedException e){
			e.printStackTrace();
		 }
		 accnt.withdraw(amt);
		 System.out.println(Thread.currentThread().getName() + "  completes withdrawal");
	} else{
		
		 System.out.println("Not enough in account for " + Thread.currentThread().getName() + " to withdraw  " + accnt.getBalance());
	}
			
 }
		
}
