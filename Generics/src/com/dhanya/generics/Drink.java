package com.dhanya.generics;

import java.util.Set;
import java.util.TreeSet;

public class Drink implements Comparable<Object>
{
	private String name;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Drink one = new Drink();
		Drink two = new Drink();
		one.name = "Tea";
		two.name = "Coffee";
		Set<Drink> set = new TreeSet<Drink>();
		set.add(one);
		set.add(two);
		
		System.out.println(set.size());
		for (Drink drink: set)
		{
			System.out.println(drink.name);
		}
		
	}

	//@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
			return 0;
	
	}

}
