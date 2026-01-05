package com.tnsif.arrays;

public class MultiArray {

	public static void main(String[] args) {
		/*int[][] arr=new int[4][3];
		for(int i=0;i<4;i++) {
			for(int j=0;j<3;j++) {
				arr[i][j]=(int)(Math.random()*10);
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
			
		}*/
		
		int[][] a= {{1,2,3},{4,5,6}};
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
			
		}
		System.out.println(a.length);

	}

}
