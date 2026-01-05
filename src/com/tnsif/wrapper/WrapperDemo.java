package com.tnsif.wrapper;

public class WrapperDemo {
	public static void main(String[] args) {
		//Auto Boxing
		int a=30;
		Integer i=new Integer(a);
		
		float b=23.4f;
		Float f=b;
		System.out.println(f);
		
		//Auto UnBoxing
		Double d=345.34;
		double dd=d;
		System.out.println(dd);
	}

}
