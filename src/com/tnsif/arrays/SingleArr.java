package com.tnsif.arrays;

public class SingleArr {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		System.out.println(arr[0]);
		System.out.println(arr[2]);
		System.out.println(arr[4]);
		int[] n=new int[3];
		n[0]=10;
		n[1]=20;
		n[2]=30;
		
//		for(int i=0;i<=2;i++) {
//			System.out.println(n[i]);
			
//		}
	    for(int i=0;i<n.length;i++) {
	    	System.out.println(n[i]);
	    }
	    System.out.println(n.length);

	}

}
