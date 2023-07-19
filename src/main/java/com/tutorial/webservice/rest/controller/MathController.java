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

// @ = annotation
// Rest webservice program
@RestController
public class MathController {

	Logger log = Logger.getLogger("MathController");

	@RequestMapping(value = "/div/{a}/{b}", method = RequestMethod.GET)
	public int division(@PathVariable int a, @PathVariable int b) {
		int div =0;
		try {
			div = a / b;
			System.out.println("printing from sysout division done");
			log.debug("1");
			log.info("2");
			log.warn("3");
			log.error("4");
			
		} catch (Exception e) {
			System.out.println("error occured");
			return -1;
		}
		return div;
	}

//http://locahost/add/10/30
	// mapping : establishing a link/map/connection between http url and method
	@RequestMapping(value = "/add/{a}/{b}", method = RequestMethod.GET)
	// Rest web method
	// Rest Application Programming Interface
	public int addition(@PathVariable int a, @PathVariable int b) {
		int sum = a + b;
		return sum;
	}

	// http://localhost/sub?number1=10&number2=20
	@RequestMapping(value = "/sub", method = RequestMethod.GET)
	public int substract(@RequestParam int number1, @RequestParam int number2) {
		int subs = number1 - number2;
		return subs;
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

	@RequestMapping(value = "/simpleInt", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public int calculateSimpleInterest(@RequestBody SimpleInterestInput si) {
		int result = si.principal * si.time * si.rate / 100;
		return result;
	}

	// sample webservice that take(input) and gives(output) complex data
	@RequestMapping(value = "/testing", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ComplexOutput test(@RequestBody SimpleInterestInput si) {
		ComplexOutput res = new ComplexOutput();
		return res;
	}

}