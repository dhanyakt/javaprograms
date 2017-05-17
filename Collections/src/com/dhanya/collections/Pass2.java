package com.dhanya.collections;

import java.util.Arrays;
import java.util.Scanner;

public class Pass2 {
	static int x = 6;
	public static  void main(String [] args) {
		String regex = "\\.\\s*";
		String test = "Test A. Test B. Test C.";
		 // insert code here
		String[] result = test.split(regex);
		System.out.println(Arrays.toString(result));
		
		
		
	}
}
