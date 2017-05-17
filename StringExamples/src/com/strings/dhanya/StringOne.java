package com.strings.dhanya;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;

public class StringOne {
	

	public static void main(String[] args)  {
		print();
		
		String str = "Java";
		System.out.println(str.length());
		System.out.println("Print the value of " + str);
		System.out.println(str.concat("Rules") + " " + str);
		str = str.replace('a', 'x');
		System.out.println(str) ;
		String str1 = "big surprise";
		System.out.println(str1.toString());
		
		StringBuilder sb = new StringBuilder("Java Rules");
		System.out.println(sb.append("wow"));
		
		String a = "JavaChamp";
		String b = "JavaChamp";
		String c = new String("JavaChamp");
		System.out.println(a==b);
		System.out.println(a==c);
		System.out.println(b.equals(c));
		System.out.println(a.equals(c));
		
		Integer i1 = new Integer(127);
		Integer i2 = new Integer(127);
		Long l = new Long(127);
		System.out.println(i1==12);
		System.out.println("Print" + i1.equals(i2));
		System.out.println(i1.equals(l));
		StringOne s = new StringOne();
		
		//System.out.println("name");
		
		
	}

	private static void print() {
		String name = "";
		System.out.println(name);
	}

	
		
		
		

}
