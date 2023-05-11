package mvc.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import mvc.dataAccessLayer.UserRepository;
import mvc.dataAccessLayer.UsersEntity;

@Service
@Scope("prototype")
public class LoginBusiness {
	
	// dependancy injection
	// instrcution to sprinng framework
	// to create object for below line
	@Autowired
	UserRepository ur;
	ArrayList<String> cart=new ArrayList<String> (); 
	public String browse(String product) {
		cart.add(product);
		return cart.toString();
	}
	public boolean checkUserPwd(String userid,String password) {
		if(userid.equals("john") && password.equals("john1!"))
			return true;
		else
			return false;
	}
	
	public boolean delete(String userid) {
		UsersEntity ue=new UsersEntity();
		ue.setUid(userid);
		ur.delete(ue);
		return true;
	}
	public boolean changepwd(String userid,String pwd) {
		UsersEntity ue=new UsersEntity();
		ue.setUid(userid);
		ue.setUid(pwd);
		ur.save(ue);
		return true;
	}
	public boolean register(String userid, String pwd) {
		System.out.println("in service");
		UsersEntity ue=new UsersEntity();
		ue.setUid(userid);
		ue.setPwd(pwd);
		ur.save(ue);
		return true;
	}
	
	public boolean loginCheck(String userid, String pwd) {
		System.out.println("in service");
		int res=ur.checkUidPwdInDB(userid, pwd);
		if(res>0)
			return true;
		else
			return false;
	}
}
