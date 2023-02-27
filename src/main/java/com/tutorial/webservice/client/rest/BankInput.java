package com.tutorial.webservice.client.rest;

public class BankInput {
/*
 {
	"customerName":"john",
	"principal":100000,
	"time":10,
	"rate":5
}
 */
	String customerName;
	int principal;
	int time;
	int rate;
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public int getPrincipal() {
		return principal;
	}
	public void setPrincipal(int principal) {
		this.principal = principal;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	public int getRate() {
		return rate;
	}
	public void setRate(int rate) {
		this.rate = rate;
	}
}
