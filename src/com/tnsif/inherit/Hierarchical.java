package com.tnsif.inherit;

public class Hierarchical {
	public void show1() {
		System.out.println("this is A class");
	}
}
class Bb extends Hierarchical {
	public void show2() {
		System.out.println("this is B class");
	}
}
class Cc extends Hierarchical{
	public void show3() {
		System.out.println("this is C class");
	
	}


}
