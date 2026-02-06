package com.tnsif.junit;

import org.junit.jupiter.api.Test;

public class SampleTest {
	@BeforeEach
	void setup() {
		System.out.println("Before Test");
	}
	@Test
	void test1() {
		System.out.println("Test Case");
	}
	@AfterEach
	void testDown() {
		System.out.println("After test");
	}

}
