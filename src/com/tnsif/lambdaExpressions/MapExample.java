package com.tnsif.lambdaExpressions;

import java.util.HashMap;

public class MapExample {

	public static void main(String[] args) {
		HashMap<String,Integer> map=new HashMap<String,Integer>();
		map.put("Java",98);
		map.put("Python",97);
		map.put("C", 78);
		map.put("C++",88);
		map.forEach((key,value)->System.out.println("Key is:" +key+ " Value is:" +value));

	}

}
