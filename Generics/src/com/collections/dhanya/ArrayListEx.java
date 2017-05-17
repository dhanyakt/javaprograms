package com.collections.dhanya;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArrayListEx {
	
	List<String> myArrayList = new ArrayList<String>();
	
	public static void main(String[] args){
		ArrayListEx aEx = new ArrayListEx();
		aEx.populateList();
		aEx.searchArray();
		Dog d = new Dog("Bella");
		d.equals(d);
		
		List<Animal> list = new ArrayList<Animal>();
		list.add(new Animal());
		list.add(new Horse());
		System.out.println("print the animal list:" + list + " " + list.size() );
		
		
		
		Map<Object, Object> m = new HashMap<Object, Object>();
		m.put("k1", new Dog("aiko"));
		m.put("k2", Pets.DOG);
		m.put(Pets.CAT, "Cat key");
		Dog d1 = new Dog("clover");
		m.put(d1, "Dog key");
		m.put(new Cat(), "Cat key");
		System.out.println(m.get("k1"));
		String k2 = "k2";
		System.out.println(m.get(k2));
		Pets p = Pets.CAT;
		System.out.println(m.get(p));
		System.out.println(m.get(d1));
		System.out.println(m.get(new Cat()));
		System.out.println(m.size());
		d1.name = "mangolina";
		//System.out.println(m.put(d1, "New key"));
		System.out.println("Afetr :" + m.get(d1));
		d1.name = "clover";
		System.out.println(m.get(d1));
		d1.name = "arthur";
		System.out.println(m.get(new Dog("arthur")));
		
	}

	private void searchArray() {
		String[] sa = { "one","two","three","four"};
		for(String s: sa){
			System.out.println(s);
		}
		Arrays.sort(sa);
		for(String s : sa){
			System.out.println("After sorting:"+ s);
		}
		
		
	}

	private void populateList() {
		myArrayList.add("Java");
		myArrayList.add("C");
		myArrayList.add("python");
		System.out.println(myArrayList);
		System.out.println(myArrayList.size());
		System.out.println(myArrayList.remove(1));
		System.out.println(myArrayList);
	}

}
