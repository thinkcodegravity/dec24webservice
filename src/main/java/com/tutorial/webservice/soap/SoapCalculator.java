package com.tutorial.webservice.soap;

import java.util.ArrayList;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.ParameterStyle;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;

@WebService
@SOAPBinding(style = Style.DOCUMENT, use = Use.LITERAL, 
parameterStyle = ParameterStyle.WRAPPED
		)
public class SoapCalculator {
	
	public int add(int p1, int p2) {
		System.out.println("adding " + p1 + "  " + p2);
		return p1 + p2;
	}
	public int sub(int p1, int p2) {
		System.out.println("sub " + p1 + "  " + p2);
		return p1 - p2;
	}
	public String greeting(String name) {
		return "hello "+name;
	}	
	
	public Address getRestaurantAddress(int x) {
		Address a=new Address();
		a.city="NY";
		a.name="john";
		return a;
	}
}
