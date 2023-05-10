package com.tutorial.webservice.soap;

import java.util.ArrayList;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.ParameterStyle;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;
@WebService
@SOAPBinding(style = Style.DOCUMENT)
public class SoapCalculator {

	public int add(int p1, int p2) {
		System.out.println("adding " + p1 + "  " + p2);
		return p1 + p2;
	}
	public int sub(int p1, int p2) {
		System.out.println("sub " + p1 + "  " + p2);
		return p1 - p2;
	}
	public int mul(int p1, int p2) {
		System.out.println("mul " + p1 + "  " + p2);
		return p1 * p2;
	}
	 
}
/*
		Document
			validation - schema xml included in WSDL
			complex input - ArrayList, Person
		RPC
			NO validation - NO schema xml included in WSDL
			simple input - int , float , boolean
		
	
*/