package com.tutorial.webserviceClient.soap;

import com.tutorial.webserviceClient.soap.stub.*;

public class SoapClientMain {

	public static void main(String[] args) {
		SoapCalculatorService ms=new SoapCalculatorService();
		SoapCalculator sc=ms.getSoapCalculatorPort();
		int result=sc.add(15, 20);
		int sub=sc.sub(20, 10);
		String greet=sc.greeting("john");
		Address a=sc.getRestaurantAddress(10);
		System.out.println("sum is :"+result);
	}

}
