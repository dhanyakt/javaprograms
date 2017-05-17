package com.dhanya.thread;

import javax.sql.rowset.Joinable;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample s = new Sample();
		s.go();

	}

	private void go() {
	
		Object obj = new Object();
		synchronized (obj) {
			try {
				obj.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			obj.notify();
			
		}
	}

}
