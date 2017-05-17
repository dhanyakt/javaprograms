package com.dhanya.collections;

import java.util.TreeSet;

public class TreeSetEx {

	public static void main(String[] args) {
		TreeSet<String> s = new TreeSet<String>();
		TreeSet<String> subs = new TreeSet<String>();
		s.add("a");
		s.add("b");
		s.add("c");
		s.add("d");
		s.add("e");
		subs = (TreeSet)s.subSet("b", true, "d", true);
		s.add("g");
		System.out.println(s);
		s.pollFirst();
		s.pollFirst();
		System.out.println(s.floor("c"));
		s.add("c2");
		System.out.println(s);
		System.out.println(subs);
		System.out.println(s.size() + " " + subs.size());

	}

}
