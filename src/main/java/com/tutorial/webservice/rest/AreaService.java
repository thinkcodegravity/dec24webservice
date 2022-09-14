package com.tutorial.webservice.rest;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AreaService {
	@RequestMapping(value = "/square/{side}", method = RequestMethod.GET)
	public int areaOfSquare(@PathVariable int side ){
		int area=side * side;
		return area;
	}
	@RequestMapping(value = "/circle/{radius}", method = RequestMethod.GET)
	public int areaOfCircle(@PathVariable int radius){
		int area=(int)(Math.PI * radius * radius);
		return area;
	}
}
