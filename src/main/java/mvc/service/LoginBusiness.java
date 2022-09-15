package mvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mvc.dataAccessLayer.UserRepository;

@Service
public class LoginBusiness {
	
	// dependancy injection
	// instrcution to sprinng framework
	// to create object for below line
	@Autowired
	UserRepository ur;
	public boolean loginCheck(String userid, String pwd) {
		int res=ur.checkUidPwdInDB(userid, pwd);
		if(res>0)
			return true;
		else
			return false;
	}
}
