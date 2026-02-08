package com.tnsif.tasks;

public class Rectangle extends Shape {
	int l,b;
	Rectangle(int l,int b){
		this.l=l;
		this.b=b;
	}
	void calArea() {
		System.out.println("Area of Rectangle="+(l*b));
	}

}
