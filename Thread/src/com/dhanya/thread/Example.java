package com.dhanya.thread;

public class Example extends Thread{
	private StringBuffer sBuffer;
	
	public Example(StringBuffer sb){
		this.sBuffer = sb;
		// System.out.println(sBuffer);
	}

	
	public static void main(String[] args) {
		StringBuffer sBuffer = new StringBuffer("A");
		Example example = new Example(sBuffer);
		Thread t1 = new Thread(example);
		Thread t2 = new Thread(example);
		Thread t3 = new Thread(example);
		/*t1.setName("Dhanya");
		t2.setName("Sanju");
		t3.setName("kid");*/
		t1.start();
		t2.start();
		t3.start();
	}

	
	@Override
	public void run() {
		synchronized (sBuffer) {
			for(int x=0; x < 10; x++){
				System.out.println(Thread.currentThread().getName() + ":" + x + sBuffer.toString());
			}
			if(sBuffer.toString().equalsIgnoreCase("A")){
				sBuffer = new StringBuffer("B");
			}
			System.out.println();
		}
	}
	
	

}
