package mvc.controller.ui;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import mvc.service.LoginBusiness;

@Controller
public class UIController {
	
// this controller does not know how to register
// it depends on login business to help with register
// loginBusienss DEPENDANCY
	@Autowired // spring framework will create object for you
	LoginBusiness lb; // NEVER EVER create/initialize "new"
// autowired can be used only on programs that
// are special spring framwork program
	
	
	@RequestMapping("/delete")
	public String del(@RequestParam String userid) {
		boolean res=lb.delete(userid);
		return "success";
	}
	
	@RequestMapping("/register")
	public String reg(@RequestParam String userid,@RequestParam String password) {
		System.out.println("in controller");
		boolean res=lb.register(userid, password);
		System.out.println("in controller again");
		if(res==true)
			return "success";
		else
			return "failure";
	}
/*
http://localhost<prefix>return string<suffix>	
http://localhost/view/success.jsp	
*/	
	
	
	
	
	@RequestMapping("/authCheck")
	public String auth(@RequestParam String userid,@RequestParam String password) {
		System.out.println("in controller");
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
