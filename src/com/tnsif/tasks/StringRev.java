package com.tnsif.tasks;

public class StringRev {

	public static void main(String[] args) {
		String str="TEAM WORK";
		char[] arr=str.toCharArray();//convert the str into character Array
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]);
			
		}

	}

}
