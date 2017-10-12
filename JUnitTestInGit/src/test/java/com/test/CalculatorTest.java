package com.test;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void addtionOfTwoNumbers() throws Exception {
		int a = 10;
		int b = 10;
		int c = a+b;
		assertTrue(c==20);
	}
	
	
	@Test
	public void differenceOfTwoNumbers() throws Exception {
		int a = 10;
		int b = 10;
		int c = a-b;
		assertTrue(c==0);
	}

	@Test
	public void multiplyOfTwoNumbers() throws Exception {
		int a = 10;
		int b = 10;
		int c = a*b;
		assertTrue(c==1000);
	}
}
