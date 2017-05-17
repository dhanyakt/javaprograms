package com.dhanya.thread;

public class ThreadEx extends Thread{
	
	static StringBuffer sb = new StringBuffer("Dhanya");
	
	public ThreadEx(StringBuffer sb){
		
	}

	public ThreadEx(){
		
	}

	
	@Override
	public  void run() {
		synchronized (sb) {
			for (int i=0; i < 100; i++) {
				System.out.println("[" + i + "]" + sb.toString());
			}
			
			if (sb.toString().equalsIgnoreCase("Dhanya")) {
				sb = new StringBuffer("DhanyaKT");
			}
			else if (sb.toString().equalsIgnoreCase("DhanyaKT")) {
				sb = new StringBuffer("SanjuDhanya");
			}
			
			System.out.println();
		}
	}
	
	public void test()
	{
		ThreadEx threadEx1 = new ThreadEx(sb);
		ThreadEx threadEx2 = new ThreadEx(sb);
		ThreadEx threadEx3 = new ThreadEx(sb);
		threadEx1.start();
		threadEx2.start();
		threadEx3.start();
	}

	public static void main(String[] args) {
		ThreadEx threadEx = new ThreadEx();
		threadEx.test();
	}

}
