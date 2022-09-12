package com.tutorial.webservice.soap;
import javax.xml.ws.Endpoint;
public class SoapWebServiceMain {

	// 65535 ports
	public static void main(String[] args) {
		Endpoint.publish("http://localhost:7080/calculation", new SoapCalculator());
	}

}
