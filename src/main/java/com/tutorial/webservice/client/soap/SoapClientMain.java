package com.tutorial.webservice.client.soap;

import com.tutorial.webservice.client.soap.stub.*;

public class SoapClientMain {

	public static void main(String[] args) {
		SoapCalculatorService ms=new SoapCalculatorService();
		SoapCalculator sc=ms.getSoapCalculatorPort();
		// soapcalculator = stub program
		// stub prgram
		//1) take input 15,20.. convert into xml soap request
		//2) connect to http soap webserice
		//3) transfer the xml soap request to webservice
		int result=sc.add(15, 20);
		System.out.println( result);
		
		
	}

}
