package com.tutorial.webservice.rest;

public class Accountant {
	//has-a
	// Accountant is depended on Calculator
	Calculator c;// outsource to spring framework
	// Spring framework... INJECTS the object for this 
	//						DEPENDANCY
	public void calculateTaxes() {
		
		c.add(10,20);//api call
	}
}
