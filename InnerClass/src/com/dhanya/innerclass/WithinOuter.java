package com.dhanya.innerclass;

public class WithinOuter {
	private int x = 7;
	
	public void makeInner(){
		MyInner in = new MyInner();
		in.seeOuter();
	}
	
	class MyInner{
		public void seeOuter(){
			System.out.println("print the outer var: " + x);
		}
	}

	public static void main(String[] args) {
		WithinOuter w = new WithinOuter();
		w.makeInner();
	    WithinOuter.MyInner inner  = w.new MyInner();
	}

}
