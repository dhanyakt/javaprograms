package com.dhanya.factorial;

public class Factorial {
	
	public int factorialOfNum (int input){
		int input_num = input;
		int factorial = 1;
		// loop through starting from 1 to the input
		for(int i = 1; i <= input_num; i++) {
			factorial *= i;
			System.out.println("print" + factorial);
		}
		
		
		
		// Multiply each number from the loop
		
		// return the number multiplied
		return factorial;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factorial factorial = new Factorial();
		int fact = factorial.factorialOfNum(3);
		System.out.println(" Print the factorial:  " + fact);
		
		int result = 0;
		for(int i = 0; i< 3; i++) {
			for(int j =1; j <= 3; j ++) {
				result = i + j;
			}
			System.out.println("Print inside" + result);
		}

	}

}
