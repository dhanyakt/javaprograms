package com.dhanya.collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetEx {
	
	
	public static void main(String[] args) {
		boolean[] ba = new boolean[5];
		Set s = new HashSet();
		ba[0] = s.add('a');
		ba[1] = s.add(new Integer(42));
		ba[2] = s.add('b');
		ba[3] = s.add('a');
		ba[4] = s.add(new Object());
		
		Set<Integer> set = new HashSet<Integer>();
		Integer i1 = 32;
		Integer i2 = 3;
		set.add(i1);
		set.add(i2);
		set.add(i1);
		System.out.println("Setsize " + set.size());
		set.remove(i1);
		System.out.println(set.size());
		i2= 4;
		i2= 5;
		set.remove(i2);
	   
		System.out.println(set.size());
		
		for(int x =0; x<ba.length;x++){
			System.out.println(ba[x] + " ");
			System.out.println();
			
			for(Object o :s){
				System.out.println(o + " ");
			}
		}
		
		
		
	}

}
