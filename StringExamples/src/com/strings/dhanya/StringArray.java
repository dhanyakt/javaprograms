package com.strings.dhanya;

public class StringArray {
	
	  public static void main(String args[]) {
	        try {
	            String arr[] = new String[10];
	            arr = null;
	            arr[0] = "one";
	            System.out.print(arr[0]);
	        } catch(Exception ex) {
	            System.out.print("exception");
	        } 
	    }

}
