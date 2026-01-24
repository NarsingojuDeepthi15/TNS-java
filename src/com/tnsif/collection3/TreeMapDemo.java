package com.tnsif.collection3;

import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		TreeMap<Integer,String> map=new TreeMap<>();
		map.put(30, "Java");
		map.put(10,"Python");
		map.put(20, "C");
		map.put(40, "C++");
		map.put(50, null);
		System.out.println(map);
		System.out.println(map.keySet());
		System.out.println(map.values());

	}

}
