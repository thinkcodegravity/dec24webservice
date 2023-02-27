package com.tutorial.webservice.rest.controller;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AreaController {
	
	Logger log=Logger.getLogger("AreaController");
	
	@RequestMapping(value = "/square/{side}", method = RequestMethod.GET)
	public int areaOfSquare(@PathVariable int side ){
		int x=10/0;
		System.out.println("sysout 1");
		System.out.println("sysout 2");
		System.out.println("sysout 3");
		System.out.println("sysout 4");
		log.debug("customer logged in");
		log.info("customer is paying bill");
		log.warn("customer is tranfer 10000000 $");
		log.error("payment webpage crashed");
// debug (most printing) > info > warn > error (most restriction logging)
		/*
		 debug = debug,info,warn,error
		 info = info,warn,error
		 warn = warn,error
		 error = error
		 */
		int area=side * side;
		return area;
	}
	
	@RequestMapping(value = "/circle/{radius}", method = RequestMethod.GET)
	public int areaOfCircle(@PathVariable int radius){
		int area=(int)(Math.PI * radius * radius);
		return area;
	}
	
}
