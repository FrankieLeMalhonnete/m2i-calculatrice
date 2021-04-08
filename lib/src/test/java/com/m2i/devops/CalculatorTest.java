package com.m2i.devops;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testAdd() {
		int a = 2;
		int b = 3;
		
		Calculator calc = new Calculator();
		int actual = calc.add(a, b);
		
		assertEquals(5, actual);
	}

	@Test
	public void testSub() {
		int a = 6;
		int b = 3;
		
		Calculator calc = new Calculator();
		int actual = calc.sub(a, b);
		
		assertEquals(3, actual);
	}

	@Test
	public void testMult() {
		int a = 5;
		int b = 4;
		
		Calculator calc = new Calculator();
		int actual = calc.mult(a, b);
		
		assertEquals(20, actual);
	}

	@Test
	public void testDiv() {
		int a = 15;
		int b = 5;
		
		Calculator calc = new Calculator();
		int actual = calc.div(a, b);
		
		assertEquals(3, actual);
	}

	@Test
	public void testIsPair() {
		Calculator calc = new Calculator();
		
		boolean actual = calc.isPair(21);
		assertFalse(actual);
		
		actual = calc.isPair(10);
		assertTrue(actual);
	}
}
