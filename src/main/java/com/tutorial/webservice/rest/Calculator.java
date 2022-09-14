package com.tutorial.webservice.rest;

// application or program
public class Calculator {
	
	// HAS-A
	int numbers; // global instance variable
				// Calculator is DEPENDED on numbers

	public Calculator(int a,String s) {
		
	}
	// DOES-A
	public int add(int a, int b) {
		return a+b;
	}
	public int sub(int x, int y) {
		return x-y;
	}
}
