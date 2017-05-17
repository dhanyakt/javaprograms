package com.dhanya.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class SortOf {

	public static void main(String[] args) {
		
		Set s = new HashSet();
		s.add(2);
		s.add(1);
		System.out.println(s);
		ArrayList<Integer >list = new ArrayList<Integer>();
		list.add(1);
		list.add(5);
		list.add(3);
		Collections.sort(list);
		System.out.println(list);
		list.add(2);
		System.out.println(list);
		Collections.reverse(list);
		System.out.println(list);

	}

}
