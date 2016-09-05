package org.login.service;

import java.util.HashMap;

import org.login.dto.User;

public class LoginService {
	HashMap<String,String> userList = new HashMap<String,String>();
	public LoginService(){
		
		userList.put("nb", "Nazmul Bari");
		userList.put("rs", "Rebeka Salma");
		userList.put("ms","Mahvish Sheza");
	}
	public boolean authentication(String userId,String password){
		if(password==null||password.trim()==""){
			return false;
		}
		return true;
	}
	
	public User getUserDetail(String userId){
		User user = new User();
		user.setUserId(userId);
		user.setUserName(userList.get(userId));
		return user;
	}
}
