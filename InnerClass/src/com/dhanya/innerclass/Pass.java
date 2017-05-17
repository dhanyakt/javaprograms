package com.dhanya.innerclass;

public class Pass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int x =5;
        Pass p = new Pass();
        p.go(x);
        System.out.println(p.go(x));
	}

	private int go(int x) {
		int y = ++x;
		return y;
		// TODO Auto-generated method stub
		
	}

}
