package com.strings.dhanya;

import java.util.*;

public class StringToInteger {
        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        
        public void add(String string, Integer i) {
                hm.put(string, i);
        }
        
        public Set<String> getKeys() {
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