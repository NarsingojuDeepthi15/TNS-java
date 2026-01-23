package com.tnsif.java.exception;

public class ExceptionDemo {

	public static void main(String[] args) {
		//Throw keyword
		int age=12;
		if(age>18) {
			System.out.println("Eligible for voting");
			
		}else {
			throw new ArithmeticException("The age is <18, so not eligible for voting");
		}
	}

}
