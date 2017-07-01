package com.test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class SimpleTest {

	
	
	@Test
	public void aSimpleText() {
		int a = 10;
		int b = 10;
		
		assertTrue(a+b==20);
	}
}
