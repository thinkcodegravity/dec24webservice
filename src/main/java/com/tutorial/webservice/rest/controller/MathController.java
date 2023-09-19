package com.tutorial.webservice.rest.controller;

import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.google.common.net.HttpHeaders;

import io.swagger.annotations.*;
import mvc.service.LoginBusiness;

@RestController
// services = addition and subtractoin
// web service = Use additon and sub service over the web/internet
public class MathController {
	
	Logger logs=Logger.getLogger("MathController");
	
	// http://localhost/areaOfRectangle?breadth=25&length=10
		@RequestMapping(value = "/login", method = RequestMethod.GET)
		public boolean checkCreden(@RequestParam String uid,@RequestParam String pwd) {
		// debug > info > warn > error	
		// log4j logging level	
			logs.debug("1");// 
			logs.info("2");// 
			logs.warn("3");
			logs.error("4");
			try {
				
			}catch(Exception e) {
				logs.error("app failed",e);
			}
			
			logs.info("customer typed userid :"+uid+"  password:"+pwd);
			System.out.println("customer typed userid :"+uid+"  password:"+pwd);
			boolean result=false;
			if(uid.equals("john") && pwd.equals("john1!"))
				result=true;
			else if(uid.equals("jane") && pwd.equals("jane1!"))
			{
				
				result=true;
			}
			else if(uid.equals("mike") && pwd.equals("mike1!"))
				result=true;
			else
				result=false;
			System.out.println("login attempt:"+result);
			return result;
		}
		
	
	// http://localhost/additionService/100/50
	// associate add method to a http url
	// @RequestMapping = allows you to LINK a java method to a URL
	@RequestMapping(value = "/additionService/{a}/{b}", method = RequestMethod.GET)
	public int add(@PathVariable int  a,@PathVariable  int b) {
		int sum=a+b;
		return sum;
	}
	
	// mapping = connect method to a url
	@RequestMapping(value = "/subService/{a}/{b}", method = RequestMethod.GET)
	public int sub(@PathVariable int a,@PathVariable int b) {
		int sub=a-b;
		return sub;
	}
	
	// http://localhost/areaOfRectangle?breadth=25&length=10
	@RequestMapping(value = "/areaOfRectangle", method = RequestMethod.GET)
	public int areaofRec(@RequestParam int breadth,@RequestParam int length) {
		int areaOfRectan=length * breadth;
		return areaOfRectan;
	}
	

	@RequestMapping(value = "/simpleInt", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public int calculateSimpleInterest(@RequestBody SimpleInterestInput si) {
		int result = si.principal * si.time * si.rate / 100;
		return result;
	}
	

	@RequestMapping(value = "/allMath/{a}/{b}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ComplexOutput allMathOperations(@PathVariable int a, @PathVariable int b) {
		ComplexOutput result = new ComplexOutput();
		result.sum = a + b;
		result.sub = a - b;
		result.mul = a * b;
		result.div = a / b;
		return result;
	}
	
}