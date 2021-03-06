package com.dhanya.collections;

import java.util.*;

public class StringToInteger {
        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        
        public void add(String a, Integer b) {
                hm.put(a, b);
        }
        
        public Collection<String> getKeys() {
                return hm.keySet();
        }
        
        public Collection<Integer> getValues() {
                return hm.values();
        }
        
        public static void main(String args[]) {
                StringToInteger si = new StringToInteger();
                si.add("one", 1);
                si.add("two", 2);
                
                System.out.println(si.getKeys());
                System.out.println(si.getValues());
        }
}