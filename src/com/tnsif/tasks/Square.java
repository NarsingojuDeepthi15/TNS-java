package com.tnsif.tasks;

public class Square extends Shape{
	int side;
	Square(int side){
		this.side=side;
	}
	void calArea() {
		System.out.println("Area of Square ="+ (side*side));
	}

}
