package com.dhanya.thread;

public class Test{
	
	
	public static void main(String[] args){
		Test1 pm1 = new Test1("One");
		pm1.start();
		Test1 pm2 = new Test1("Two");
		pm2.run();
		
	}
	
	
}

