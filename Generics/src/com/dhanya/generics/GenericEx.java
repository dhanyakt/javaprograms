package com.dhanya.generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GenericEx {

	public static void main(String[] args) {
		List<String> myList = new ArrayList<String>();
		myList.add("Fred");
		myList.add("Dhanya");
		myList.add("Sanju");
		
		takeListOfStrings(myList);
		Iterator iterator = myList.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}

	}

	private static void takeListOfStrings(List list) {
		list.add(new Integer(42));
		
		
	}

}
