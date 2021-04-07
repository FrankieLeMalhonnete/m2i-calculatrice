package com.m2i.devops;

public class Calculator {

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
}
