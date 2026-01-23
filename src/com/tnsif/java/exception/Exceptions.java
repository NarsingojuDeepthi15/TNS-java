package com.tnsif.java.exception;

public class Exceptions{

	public static void main(String[] args) {
		//ArithmeticException
		try {
			int a,b;
			a=10;
			b=0;
			int c=a/b;
			
		}catch(Exception e){
			System.out.println("The division is not possible");
			
		}
		//IndexOutOfBoundsException
		try {
			int[] arr= {1,2,3,4};
			System.out.println(arr[0]);
			System.out.println(arr[4]);
		}catch(Exception e1) {
			System.out.println("You can't read the value of arr[4]");
		}
		//NullPointerException
		try {
			String s=null;
			System.out.println(s.length());
		}catch(Exception e2) {
			System.out.println("The string value is null");
		}

	}
}
