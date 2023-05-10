package com.tutorial.webservice.client.soap;

import com.tutorial.webserviceClient.soap.stub.SoapCalculator;
import com.tutorial.webserviceClient.soap.stub.SoapCalculatorService;

public class SoapClientMain {

	public static void main(String[] args) {
		SoapCalculatorService ms=new SoapCalculatorService();
		SoapCalculator sc=ms.getSoapCalculatorPort();
		int result=sc.add(75, 35);
		System.out.println( result);
		
		
	}

}
