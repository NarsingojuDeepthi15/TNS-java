package com.tnsif.polymorphism;

public class MethodOver {
	public void show() {//no parameters
		System.out.println("No parameters ");
	}
	public void show(int a,double b) {//two parameters
		System.out.println("Integer:"+a+" Double:"+b);
	}
	public void show(double b,int a,float f) {//three parameters
		System.out.println("Double:"+b+" Integer:"+a+" Float:"+f);
	}

}
