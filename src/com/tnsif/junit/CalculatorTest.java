package com.tnsif.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculatorTest {
	Calculator c=new Calculator();
	@Test
	void addition() {
		assertEquals(10,c.add(5, 5));
		
	}
	@Test
	void subtraction() {
		assertEquals(5,c.subtract(10, 5));
		
	}
	@Test
	void multiplication() {
		assertEquals(10,c.multi(2, 5));
		
	}
	@Test
	void division() {
		assertEquals(1,c.divide(5, 5));
		
	}
	
}
