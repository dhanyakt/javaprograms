package com.dhanya.thread;

public class Cruiser implements Runnable {
    public static void main(String[] args) {
        Thread a = new Thread(new Cruiser());
        a.start();
        
        System.out.print("Begin");
        try {
			a.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        System.out.print("End");
    }
    
    public void run() {
        System.out.print("Run");
    }
}