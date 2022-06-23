package com.tutorial.webservice.rest;

public class Perso {
	String name;
	int age;
	String city;
	// get methods to read information from java variable
	// set methods to set/write information into java variables
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
}
