package com.tutorial.webserviceClient.rest;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import com.tutorial.webserviceClient.rest.Input;
import com.tutorial.webserviceClient.rest.Output;

public class RestClientMain {

	public static void main(String[] args) {
		complexOutput();
	}
	public static void calculatePostSI() {
		RestTemplate calPostSI=new RestTemplate(); // Rest stub program
		WSClientSimplInterest myInput=new WSClientSimplInterest();
		int res=calPostSI.postForObject("http://localhost/calSimpleInterest",  myInput , Integer.class);
		System.out.println("simple interest is :"+res);
	
	}
	public static void complexOutput() {
		RestTemplate multiOp=new RestTemplate(); // Rest stub program
		ComplexOutputJson res=multiOp.getForObject("http://localhost/multiOutput/5", ComplexOutputJson.class);
		System.out.println("mutli output is :"+res);
	
		
	}
	
	public static void calculateSI() {
		RestTemplate calSI=new RestTemplate(); // Rest stub program
		int res=calSI.getForObject("http://localhost/calSI?p=1000&t=30&r=5", Integer.class);
		System.out.println("simple interest is :"+res);
	}
	public static void callAreaOfRectangleWebService() {
		RestTemplate rectangle=new RestTemplate(); // Rest stub program
		int res=rectangle.getForObject("http://localhost/rectangle/5/7", Integer.class);
		System.out.println("area of rectangle is :"+res);
	}
	
	
/*	
	Get Http client
	URL = ? includes url and input both
	Response = what output is expected from rest services
		int/string/float etc.. if response is json an object(json compliant)
*/
	public static void testAdd() {
		RestTemplate square=new RestTemplate(); // Rest stub program
		int res=square.getForObject("http://localhost:6060/areaOfSquare/5", Integer.class);
		System.out.println("Add rest service result :"+res);
	}
	// get method
	// URL = url include http part + input
	// output = resonse
	public static void testSub() {
		RestTemplate subWebService=new RestTemplate(); // Rest stub program
		int res=subWebService.getForObject("http://localhost:6060/subCal?param1=10&param2=5", Integer.class);
		System.out.println("Sub rest service result :"+res);
	}
/*
	Post Http client
	URL = ? includes url 
	Request = if sending json input pass object(json compliant) 
	Response = what output is expected from rest services
		int/string/float etc.. object(json compliant) if response is json
*/
	public static void testSimpleInterstJsonInput()
	{

		RestTemplate postTest=new RestTemplate();
		SI input=new SI();
		input.principal=10000; 
		input.time=30;
		input.rate=4;
		// {	"principal":10000,	"time":30,	"rate":4 }
		int res=postTest.postForObject
				("http://localhost:6060/calSI",
				input,
				Integer.class);
	System.out.println(res);
	}
	public static void testJsonRes()
	{
		RestTemplate square=new RestTemplate(); // Rest stub program
		JSONOutput res=square.getForObject("http://localhost:6060/allMath/50/10", JSONOutput.class );
		System.out.println(res);
		
	}
	/*
	 	public static void testSubP() {
		RestTemplate getTest=new RestTemplate();
		
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
		MultiValueMap<String, String> map= new LinkedMultiValueMap<String, String>();
		map.add("x", "20");
		map.add("y", "10");
		HttpEntity<MultiValueMap<String, String>> request = new HttpEntity<MultiValueMap<String, String>>(map, headers);
   
		int res=getTest.postForObject
				("http://localhost:8888/subCalP",request,
						Integer.class);
		System.out.println("Sub rest service result :"+res);
	}
	 */
}
