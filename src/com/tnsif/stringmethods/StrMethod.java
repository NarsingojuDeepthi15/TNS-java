package com.tnsif.stringmethods;

public class StrMethod {

	public static void main(String[] args) {
		String s=new String("Hello");
		String s1="Java";
		String s2="Student";
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		System.out.println(s.length());
		System.out.println(s.charAt(0));
		System.out.println(s.indexOf('e'));
		System.out.println(s.indexOf('l'));
		System.out.println(s);
		System.out.println(s.equals(s1));
		System.out.println(s.replace(s,s2));

	}

}
