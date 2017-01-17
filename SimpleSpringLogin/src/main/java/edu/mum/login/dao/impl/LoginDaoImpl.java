package edu.mum.login.dao.impl;

import org.springframework.stereotype.Repository;

import edu.mum.login.dao.LoginDao;

@Repository
public class LoginDaoImpl implements LoginDao {

	
	private static final String USER_NAME = "admin";
	private static final String PASSSWORD = "test123";
	
	
	@Override
	public boolean authenticateUser(String userName, String password) {
		if(userName.equals(USER_NAME) && password.equals(PASSSWORD))
			return true;
		return false;
	}

}
