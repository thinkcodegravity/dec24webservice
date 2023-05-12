package mvc.controller.ui;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tutorial.webservice.client.rest.BankInput;

import mvc.service.LoginBusiness;

@Controller
@Scope("prototype")
public class UIController {
	
	
	// this controller does not know how to register
		// it depends on login business to help with register
		// loginBusienss DEPENDANCY
		@Autowired // spring framework will create object for you
		LoginBusiness lb; // NEVER EVER create/initialize "new"
	// autowired can be used only on programs that
		// are special spring framwork program
		
		/*
		@Autowired 
		BankInput bi;
NO - BankInput  does not have
@ spring framework annottion
		*/
		
	@RequestMapping("/browse")
	@ResponseBody
	public String browse(@RequestParam String product) {
		System.out.println(" in controller");
		String result=lb.browse(product);
		return result;
	}
	
	
	@RequestMapping("/checkUseridPassword")
	public String checkUseridPwd(@RequestParam String userid,@RequestParam String password) {
		boolean result=lb.checkUserPwd(userid, password);
		if(result==true)
			return "loginsuccess";
		else
			return "loginfailed";
	}
	
	
	
	
	
	
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
			return "/view/success.jsp";
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
	// /view/welcome.jsp
	
	@RequestMapping("/failure")
	public String error() {
		return "error";
	}

}
