package com.tnsif.day3;
import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Your name:");
		String name=sc.nextLine();
		System.out.print("Enter your city:");
		String city=sc.nextLine();
		System.out.print("Enter your salary:");
		int salary=sc.nextInt();
		sc.close();

	}

}
