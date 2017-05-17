package com.dhanya.collections;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Example {
    public static void main(String args[]) {
        List list = new LinkedList<String>();
        list.add("one");
        list.add("two");
        list.add("three");
        
        System.out.println(list);
       Collections.reverse(list);
        Iterator iter = list.iterator();
        System.out.println(list);
        
        
        
    }
}