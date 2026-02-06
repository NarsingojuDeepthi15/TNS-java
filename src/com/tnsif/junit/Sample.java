package com.tnsif.junit;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class Sample {
	@Test
	void testException() {
		assertThrows(ArithmeticException.class,()->{
			int x=10/0;
			});
	}

}
