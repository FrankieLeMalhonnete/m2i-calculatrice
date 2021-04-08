package com.m2i.devops;

import java.util.ArrayList;
import java.util.List;

public class Calculator {

	// Triggers Spotbug error report
	public Object toto = null;
	
	public int add(int a, int b) {
		return a+b;
	}
	
	public int sub(int a, int b) {
		return a-b;
	}
	
	public int mult(int a, int b) {
		return a*b;
	}
	
	public int div(int a, int b) {
		return a/b;
	}
	
	public boolean isPair(int a) {
		if (a%2 == 0) return true;
		else return false;
	}
	
	public List<Integer> showPrimeNumbersUntil(int value) {
		List<Integer> primeNumbers = new ArrayList<Integer>();
		boolean flagNotPrime = false;
		
		for (int curs = 2 ; curs <= value ; curs++) {
			for (int i=2 ; i <= curs / 2 ; ++i) {
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
