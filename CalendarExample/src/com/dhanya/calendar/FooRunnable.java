package com.dhanya.calendar;

public class FooRunnable implements Runnable {

	@Override
	public void run() {
		go();
	}
	
	private void go() {
		doMore();
	}

	private void doMore() {
		System.out.println("top of stack");
		
	}

public static void main(String[] args) {
	Runnable  threadJob = new FooRunnable();
	Thread t = new Thread(threadJob);
	t.start();
	System.out.println("main method");
	
		
	}
}
