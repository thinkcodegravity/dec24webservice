package com.tutorial.webservice.soap;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

// publishing/providing webservice
// clients can calcualte area of square and rectangle
@WebService
@SOAPBinding(style = Style.RPC)

public class Math {
	public int calculateSquare(int sides) {
		return sides * sides;
	}
	public int calculateRectangle(int height,int width) {
		return height * width;
	}
}
