package com.tutorial.webservice.soap;
import javax.xml.ws.Endpoint;
public class SoapWebServiceMain {

	// 65535 ports
	public static void main(String[] args) {
		// if no port mentioned in the url.. port if by default 80.. (http=80)
		//
		Endpoint.publish("http://localhost:7080/calculation", new SoapCalculator());
	}

}
