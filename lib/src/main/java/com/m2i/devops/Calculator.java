package com.m2i.devops;

import java.util.ArrayList;
import java.util.List;

/**
 * Calculator engine class.
 * Provides few functions...
 * 
 * @author Frankie
 * @version 1.0
 */
public class Calculator {

	/**
	 * Function Add two values.
	 * 
	 * @param a first value
	 * @param b second value
	 * @return result of addition
	 */
	public int add(int a, int b) {
		return a + b;
	}
	
	/**
	 * Function Subtract two values.
	 * 
	 * @param a first value
	 * @param b second value
	 * @return result of subtraction
	 */
	public int sub(int a, int b) {
		return a - b;
	}
	
	/**
	 * Function Multiply two values.
	 * 
	 * @param a first value
	 * @param b second value
	 * @return result of multiplication
	 */
	public int mult(int a, int b) {
		return a * b;
	}
	
	/**
	 * Function Divide two values.
	 * 
	 * @param a first value
	 * @param b second value
	 * @return result of division
	 */
	public int div(int a, int b) {
		return a / b;
	}
	
	/**
	 * Check if value is Pair.
	 * 
	 * @param a value to check
	 * @return True if pair
	 */
	public boolean isPair(int a) {
		if (a%2 == 0) return true;
		else return false;
	}
	
	/**
	 * Returns a list of prime numbers until the provided value.
	 * 
	 * @param value the max value to get prime numbers
	 * @return a list of prime numbers
	 */
	public List<Integer> showPrimeNumbersUntil(int value) {
		List<Integer> primeNumbers = new ArrayList<Integer>();
		boolean flagNotPrime = false;
		
		for (int curs = 2 ; curs <= value ; curs++) {
			for (int i = 2; i <= curs / 2; ++i) {
				if (curs % i == 0) {
					flagNotPrime = true;
					break;
				}
			}
			if (flagNotPrime == false) {
				primeNumbers.add(curs);
			} else {
				flagNotPrime = false;
			}
		}
		return primeNumbers;
	}
}
