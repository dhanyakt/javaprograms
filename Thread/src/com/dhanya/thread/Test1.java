package com.dhanya.thread;

public class Test1 extends Thread{
	private String sName = "";

	public Test1(String string) {
		sName = string;
	}
	
	public void run(){
		for(int i =0; i < 2 ; i++){
			try{
			 sleep(1000);
			}catch(InterruptedException e){}

			yield();
			System.out.println(sName);
			}
	}


}
