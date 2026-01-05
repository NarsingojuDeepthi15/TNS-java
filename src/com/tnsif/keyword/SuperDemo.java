package com.tnsif.keyword;

public class SuperDemo {
	int n=20;
	public void show() {
		System.out.println("This is a Demo class");
	}

}
class Demo1 extends SuperDemo{
	int n=40;
	public void display() {
		System.out.println(super.n);
		super.show();
		System.out.println(this.n);
		System.out.println("this is demo class");
	}

}
