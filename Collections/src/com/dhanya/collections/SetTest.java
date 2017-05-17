package com.dhanya.collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import javax.swing.text.html.HTMLDocument.Iterator;

public class SetTest {
	Iterator it;

	public static void main(String[] args) {
		String[] colors = {"blue", "red","yellow","orange","green"};
		Arrays.sort(colors);
		for(String c:colors){
			System.out.println(c);
		}
		
		
		Set<Integer> set = new HashSet<Integer>();
		Integer i1 = 45;
		Integer i2 = 46;
		set.add(i1);
		set.add(i2);
		set.add(i1);
		
		for(Integer i :set){
			System.out.println(i);
		}
		System.out.println("Setsize " + set.size());
		set.remove(i1);
		
		for(Integer i :set){
			System.out.println(i);
		}
		System.out.println("Setsize " + set.size());
		i2 = 48;
		set.remove(i2);
		System.out.println(set.size());
		
		for(Integer i :set){
			System.out.println(i);
		}
		
		TreeSet<Integer> s = new TreeSet<Integer>();
		TreeSet<Integer> subs = new TreeSet<Integer>();
		for(int i =606; i<613; i++){
			if(i%2== 0)
				s.add(i);
			subs = (TreeSet)s.subSet(608, true, 611, true);
			s.add(609);
			
		}
		
		System.out.println(s);
		System.out.println( subs);
		
	}

}
