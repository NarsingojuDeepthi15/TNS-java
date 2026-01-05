package com.tnsif.inherit;

public class Multi {
	public void show1() {
		System.out.println("This is A class");
	}
}
class B extends Multi{
	public void show2() {
		System.out.println("This is B class");
	}
}
class C extends B{
	public void show3() {
		System.out.println("This is C class");
	
	}


}
