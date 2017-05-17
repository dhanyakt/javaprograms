package com.dhanya.fibonacci;

public class Fibonacci {
	
	public int fibonacciNum(int n) {
		// Initialize first two numbers for fibonacci
		int first_num = 0;
		int sec_num = 1;
		// Sum of the first and sec number
		
		int sum = 1;
		
		for(int i =2; i< n; i++) {
			
			sum = first_num + sec_num;
			first_num = sec_num;
			sec_num = sum;
			System.out.println(sum);
			
			
		}
		
		return n;
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Fibonacci fibo = new Fibonacci();
		// Read the number to print the fibonacci
		fibo.fibonacciNum(6);
	}

}
