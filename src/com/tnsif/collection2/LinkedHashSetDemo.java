package com.tnsif.collection2;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		LinkedHashSet<String> ls=new LinkedHashSet<>();
		ls.add("Java");
		ls.add("python");
		ls.add("C");
		ls.add("C++");
		ls.add("Java");
		System.out.println(ls);
		

	}

}
