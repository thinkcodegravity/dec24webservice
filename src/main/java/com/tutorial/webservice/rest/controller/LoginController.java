package com.tutorial.webservice.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import mvc.service.LoginBusiness;

@RestController
public class LoginController {
	
	@Autowired
	LoginBusiness lb;
	@RequestMapping(value = "/logrest/{userid}/{pwd}", method = RequestMethod.GET)
	public String loginPage(@PathVariable String userid,@PathVariable String pwd){
		boolean result=lb.loginCheck(userid, pwd);
		if(result==true)
			return "WELCOME TO THE WEBSITE";
		else
			return "LOGIN FAILED";
	}
 				
}