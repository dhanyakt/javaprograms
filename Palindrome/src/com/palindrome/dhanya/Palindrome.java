package com.palindrome.dhanya;

public class Palindrome {
	
	public void reverseString(String str) {
		// Read the input string length
		StringBuffer reversedString = new StringBuffer();
		String output = "";
		int len = str.length();
				
		// loop through the string
		for(int i= len-1; i>=0; i--) {
			//System.out.println(str.charAt(i));
			// append the reversed char to reversedString
			reversedString = reversedString.append(str.charAt(i));
			output = reversedString.toString();
			
		}
		// print the reversed string
		System.out.println("String Reversed:" + reversedString);
		if(output.equalsIgnoreCase(str)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("not palindrome");
		}
		

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Palindrome palindrome = new Palindrome();
		palindrome.reverseString("323");
		
	}

}
