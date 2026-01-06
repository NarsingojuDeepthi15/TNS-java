package com.tnsif.tasks;

public class NestedTryExample {

	public static void main(String[] args) {
		try{
			int[] arr={2,4,5};
			try {
				int result=arr[1]/0;
				System.out.println(result);
			}catch(ArithmeticException e) {
				System.out.println("Inner catch:cannot divided by zero");
			}
			System.out.println(arr[5]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Outer catch:Array index Error");
		}
		System.out.println("Program ends normally");
	}

}
