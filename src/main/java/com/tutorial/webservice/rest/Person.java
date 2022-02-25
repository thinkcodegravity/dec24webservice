package com.tutorial.webservice.rest;

public class Person {
	
/* this class is below JSON representation
	 {
		"firstName":"john",
		"lastName":"doe",
		"age":10
	 }	
*/
	
	String firstName;
	String lastName;
	int age;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
