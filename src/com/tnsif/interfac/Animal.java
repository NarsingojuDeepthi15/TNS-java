package com.tnsif.interfac;

public interface Animal {
	void sound1();
    
	}
	class Dog implements Animal{
		public void sound1() {
			System.out.println("Dog barks");
		}


}
