package com.dhanya.generics;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		Dog x = new Dog();
		x.setName("Bella");
		x.setSize(40);
		
		Dog y = new Dog();
		y.setName("Bella");
		y.setSize(40);
		
		y = x;
		System.out.println(x.hashCode());
		System.out.println(y.hashCode());
		
		if(x.equals(y)){
			System.out.println("true");
		}
		Integer i = 42;
		Integer c = 42;
		if(i.equals(c)){
			System.out.println("true");
		}
		System.out.println(i.hashCode());
		System.out.println(c.hashCode());
		
		if(i == c){
			System.out.println(i.hashCode() + " " + c.hashCode());
		}
		String s1 = "abc";
		String s2 = "abc";
		System.out.println(s1.hashCode() + " " + s2.hashCode());
		if(s2.equals(s1)){
			System.out.println("true");
		}
		
		
	}

}
