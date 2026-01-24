package com.tnsif.collection3;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<Integer,String> map=new HashMap<>();
		map.put(101, "Java");
		map.put(102, "Python");
		map.put(103, "C");
		map.put(101, "spring");
		map.put(null, "HTML");
		System.out.println(map);
		System.out.println(map.get(102));
		System.out.println(map.remove(103));
	}

}
