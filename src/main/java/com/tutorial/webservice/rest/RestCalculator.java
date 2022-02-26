package com.tutorial.webservice.rest;

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

@RestController
@Api(description="this is my web service that can calculate area of square, simple interesst, math opertion etc")
public class RestCalculator {
	Logger log=Logger.getLogger("RestCalculator");
	
	//  localhost/areaOfSquare/5
	// configure this method/service with http URL
	@RequestMapping(value = "/areaOfSquare/{input1}", method = RequestMethod.GET)
	@ApiOperation(value="provide input as a side.. this service will return area of square ")
	public int calculateSquare(@PathVariable(name="input1") int sides) {
		int area=sides * sides;
		return area;
	}
	
	
	// http://localhost/addCal/12/10
	@RequestMapping(value = "/addCal/{param1}/{param2}", method = RequestMethod.GET)
	public int add(@PathVariable(name="param1") int param1, @PathVariable int param2) throws Exception {
		// debug >  info > warn > error
		int	sum=param1 + param2;
	
	return sum;
	}
	
	
	// http://localhost/subCal?param1=10&param2=5
	@RequestMapping(value = "/subCal", method = RequestMethod.GET)
	public int sub(@RequestParam("param1") int a, @RequestParam("param2") int b) {
		int sub=a - b;
		return sub;
	}
	
	//http://localhost/login?pwd=asdasd&userid=adsad
	// http://localhost/jsonReqMul - send json in request body,
	// input type json string
	@RequestMapping(value = "/jsonReqMul", method = RequestMethod.POST, 
			consumes = MediaType.APPLICATION_JSON_VALUE)
	public int mulCalculator(@RequestBody Input in) {
		// "Input" parameter is json compliant java program
		int mul=in.param1 * in.param2;
		return mul;
	}
	
	// http://localhost/calSI
	/*
	 	{
			"principal":100000,
			"time":12,
			"rate":3
		}	 
	 */
	@RequestMapping(value = "/calSI", method = RequestMethod.POST, 
			consumes = MediaType.APPLICATION_JSON_VALUE)
	public int calculateSI(@RequestBody  SimpleInterest si) {
		int result=si.principal * si.time * si.rate / 100;
		return result;
	}
	
	
	//http://localhost/allMath/10/5
	@RequestMapping(value = "/allMath/{param1}/{param2}", 
			method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public Output allArithmetic(@PathVariable(name="param1") int a,
			@PathVariable(name="param2")  int b){
		Output o=new Output();
		o.sum=a+b;
		o.sub=a-b;
		o.mul=a*b;
		o.div=a/b;
		return o;
	}
	
}