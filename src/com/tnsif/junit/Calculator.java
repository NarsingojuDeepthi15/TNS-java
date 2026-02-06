package com.tnsif.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Calculator {
	public int add(int a,int b) {
		return a+b;
	}
	public int subtract(int a,int b) {
		return a-b;
	}

	public int multi(int a,int b) {
		return a*b;
	}
	public int divide(int a,int b) {
		return a/b;
		
	}
}
