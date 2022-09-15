package mvc.controller.ui;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import mvc.service.LoginBusiness;

@Controller
public class UIController {
	
	@Autowired
	LoginBusiness lb;
	
	@RequestMapping("/authCheck")
	public String auth(@RequestParam String userid,@RequestParam String password) {
		boolean res=lb.loginCheck(userid, password);
		if(res==true)
			return "success";
		else
			return "failure";
	}
	
	// http://ipaddress:port/success
	//http://ipaddress:port/<prefix><return><suffix>
	//http://ipaddress:port/jsp/welcome.jsp

	@RequestMapping("/success")
	public String welcome() {
		return "welcome";
	}
	
	@RequestMapping("/failure")
	public String error() {
		return "error";
	}

}
