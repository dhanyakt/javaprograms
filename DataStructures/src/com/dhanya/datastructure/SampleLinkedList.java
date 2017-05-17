package com.dhanya.datastructure;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class SampleLinkedList {
	
	public void implementLinkedList() {
		
		List<String> dhanyaList = new LinkedList<String>();
		dhanyaList.add("mango");
		dhanyaList.add("banana");
		dhanyaList.add("orange");
		System.out.println(dhanyaList);
		System.out.println(dhanyaList.hashCode());
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SampleLinkedList sample = new SampleLinkedList();
		sample.implementLinkedList();
		
		Set<String> set = new HashSet<String>();
		set.add(null);
		set.add("d");
		System.out.println(set);
	}
	
	

}
