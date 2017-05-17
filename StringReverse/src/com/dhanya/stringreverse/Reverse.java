package com.dhanya.stringreverse;

public class Reverse {
	
	public String reverseString(String strInput) {
		StringBuffer strOutput = new StringBuffer();
		// loop thru all the input string characters in reverse order
		int lenOfString = strInput.length();
		
		for (int i = lenOfString - 1 ; i >= 0 ; i--) {
			// add the characters to a string or string buffer
			strOutput.append(strInput.charAt(i));
			System.out.println("output" + strOutput);
		}
		
		// return the reversed string to the caller
		String output = strOutput.toString();
		return output;
		
	}

	public static void main(String[] args) {
		long startTime = System.nanoTime();
		Reverse reverse = new Reverse();
		String strInput = "DHANYASANJU";
		System.out.println(strInput + " reversed to --> " + reverse.reverseString(strInput));
		long endTime = System.nanoTime();
		System.out.println("Total time: " + ((endTime - startTime)) + " nano seconds.");
		if(strInput.equals(reverse)) {
			System.out.println("Print: Yes");
		}
		else {
			System.out.println("No");
		}
	}

}
