package com.dhanya.collections;

import java.util.HashMap;
import java.util.Map;

import com.dhanya.collections.Dog.Pets;

public class MapTest {


	public static void main(String[] args) {
		
		Dog d = new Dog("bella");
		Object o = null;
		d.equals(o);
		
		Map<Object, Object> m = new HashMap<Object, Object>();
		m.put("k1", new Dog("aiko"));
		m.put("k2", Pets.DOG);
		m.put(Pets.CAT, "CAT key");
		Dog d1 = new Dog("clover");
		m.put(d1, "Dog key");
		m.put(new Cat(), "CAT key");
		
		System.out.println(m.get("k1"));
		String k2 = "k2";
		System.out.println(m.get(k2));
		Pets p = Pets.CAT;
		System.out.println(m.get(p));
		System.out.println(m.get(d1));
		System.out.println(m.get(new Cat()));
		System.out.println((m.size()));
		
		//d1.name ="magnol";
		System.out.println(m.equals(d1));
		System.out.println(m.equals(p));
		System.out.println(m.equals(d1));
		System.out.println(m.equals(k2));
		
		
	}

}
