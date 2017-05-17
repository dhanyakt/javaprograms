package com.strings.dhanya;

import org.omg.PortableServer.POAManagerPackage.State;

class Util {
    public enum State{ACTIVE, DELETED, INACTIVE}
}

public class Test {

	public static void main(String[] args) {
		method(null);
		Object obj = new String[] {"one","two"};
		for (String s : (String[])obj) System.out.print(s + ".");
		String str = "null";
		  if (str == null) {
              System.out.print("hiiiiiiiiiiiiiiiiiiiiiii");
              
		  }
		  
		  State state = State.INACTIVE;
		  Util.State states = Util.State.INACTIVE;
		  
		    doStuff("abcd");
	        doStuff("efg");
	        doStuff("hi");
	        
	        String d = "abcd";
	        System.out.println(d.length());
		
		  
		
		byte s = 1;
		switch(s) {
		
		case 0:
			System.out.println("not");
			break;
			
		case 1:
			System.out.println("correct");
		}

	}

	private static void method(StringBuffer object) {
		System.out.println("object");
	}
	
	private static void method(Object str) {
		System.out.println("string");
	}

	 private static void doStuff(String str) {
	        int var = 4;
	        if (var == str.length()) {
	            System.out.print(str.charAt(--var) + " ");
	        }
	        else {
	            System.out.print(str.charAt(0) + " ");
	        }
	    }
	
	
		
	


}
