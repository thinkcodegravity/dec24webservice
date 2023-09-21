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
	@Autowired // spring framework will create object for you
	LoginBusiness lb; // NEVER EVER create/initialize "new"
	
	
	
	
	
	
	
	
	@RequestMapping("/authCheck")
	public String auth(@RequestParam String userid,@RequestParam String password) {
		System.out.println("in controller");
		boolean res=lb.loginCheck(userid, password);
		if(res==true)
			return "success";
		else
			return "failure";
	}

	

	
	
	
	
	
	// http://localhost<Prefix>success<suffix>
	// http://localhost/view/success.jsp		
							

	@RequestMapping("/failure")
	public String error() {
		return "error";
		// http://localhost<Prefix>welcome<suffix>
		// http://localhost/view/error.jsp		
		
	}

}
