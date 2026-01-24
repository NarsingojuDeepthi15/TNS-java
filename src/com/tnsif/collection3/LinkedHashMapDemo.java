package com.tnsif.collection3;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		LinkedHashMap<Integer,String> map=new LinkedHashMap<>();
		map.put(1,"Apple");
		map.put(6,"Banana");
		map.put(8,"Mango");
		map.put(4,"Orange");
		map.put(5,"Kiwi");
		System.out.println(map);
		System.out.println(map.size());
		System.out.println(map.remove(4));
		System.out.println(map);

	}

}
