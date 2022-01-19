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
	
	// input = john, andy , mike
	// output = john, andy , mike
	public ArrayList<String> test(ArrayList<String>  t){
		return t;
	}
	
	public int add(int p1, int p2) {
		System.out.println("adding " + p1 + "  " + p2);
		return p1 + p2;
	}
	public boolean login(String userid, String password) {
		if (userid.equals("john") && password.equals("john1!"))
			return true;
		else
			return false;

	}

}

class Input {
	int a;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	int b;

}
