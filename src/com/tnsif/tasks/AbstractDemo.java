package com.tnsif.tasks;

public class AbstractDemo {
	public static void main(String[] args) {
		Shape s1=new Rectangle(10,8);
		s1.show();
		s1.calArea();
		
		Shape s2=new Square(8);
		s2.show();
		s2.calArea();
	}

}
