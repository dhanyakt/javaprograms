package com.strings.dhanya;

public class TestOne { 
    private static void doStuff(String str) {
        int var = 4;
        if (var == str.length()) {
            System.out.print(str.charAt(--var) + " ");
        }
        else {
            System.out.print(str.charAt(0) + " ");
        }
    }
    
    public static void printB(String str) {
        System.out.print(Boolean.valueOf(str)? "true" : "false"); 
   }
    public static void main(String args[]) {
        doStuff("abcd");
        doStuff("efg");
        doStuff("hi");
        printB("tRuE");
        printB("false");
    }
    
    public static void book(){
    	System.out.println("static");
    	TestOne t = new TestOne();
    	t.cancelBooking();
    }
    
    public void cancelBooking(){
    	System.out.println("non-static");
    	book();
    }
}