package com.dhanya.array;

import java.text.DateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;

public class Adding {
	
	

	public static void main(String[] args) {
		Arithmetic arithmetic = new Arithmetic();
		System.out.println(arithmetic.getClass().getSuperclass().getName());
		arithmetic.addSum(10, 20);
		
		Adder a = new Adder();
		System.out.println(a.getClass().getSuperclass().getName());
		int s = a.addSum(3, 5);
		
		System.out.println("Print sum:" + s);
		// TODO Auto-generated method stub
		int n = 2;
		//int[] a;
		for(int i =0; i<=10; i++) {
			System.out.println(n + "x" + i + "=" + (n*i));
		}
		
		int[] number = {1,2,3};
		Collections.reverse(Arrays.asList(number));
		
		
	}

}
