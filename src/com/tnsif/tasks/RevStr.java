package com.tnsif.tasks;

public class RevStr {

	public static void main(String[] args) {
		String s1="TEAM";
		String s2="WORK";
		char[] a1=s1.toCharArray();
		char[] a2=s2.toCharArray();
		for(int i=a1.length-1;i>=0;i--) {
			System.out.print(a1[i]);
		}
		System.out.println();
		for(int j=a2.length-1;j>=0;j--) {
			System.out.print(a2[j]);
		}

	}

}
