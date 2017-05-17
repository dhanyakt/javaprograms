package com.strings.dhanya;

public class StringBufferEx {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		// sb.append("TestString");
		sb.append("Sun");
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		String s1 = "Sun";
		String s2 = new String("Sun");
		String s3 = new String("Sun").intern();
		System.out.println(s1 == s2);
        System.out.println(s2 == s3);
        System.out.println("Predicted: true     Actual: " + s1.equals(sb));
        method(sb);
        System.out.println(sb);
        
        Integer i = new Integer(23);
        Integer i1 = new Integer(23);
        System.out.println(i == i1);
        System.out.println(i.equals(i1));
        
        
	}

	private static void method(String s) {

		System.out.println("String version");
	
	}
	
	private static void method(StringBuffer sb) {
		System.out.println("StringBuffer version");
		
		sb = new StringBuffer("Hai");
		sb.append("dhanya");
		
	}


}
