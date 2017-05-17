package com.dhanya.thread;

public class Threads4 {

	public static void main(String[] args) {
		Threads4 th = new Threads4();
		th.go();

	}

	private void go() {
		Runnable r = new Runnable() {
		
		@Override
		public void run() {
			System.out.println("foo");
			}
		};
		Thread t = new Thread(r);
		t.start();
		
	}

}
