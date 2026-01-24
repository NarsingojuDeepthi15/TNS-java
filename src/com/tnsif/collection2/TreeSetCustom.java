package com.tnsif.collection2;

import java.util.TreeSet;

public class TreeSetCustom {

	public static void main(String[] args) {
		TreeSet<Student> ts=new TreeSet<>((s1,s2)->s1.age-s2.age);
		ts.add(new Student(22,"Aman"));
		ts.add(new Student(20,"Deepthi"));
		ts.add(new Student(21,"Ravi"));
		System.out.println(ts);
		

	}

}
