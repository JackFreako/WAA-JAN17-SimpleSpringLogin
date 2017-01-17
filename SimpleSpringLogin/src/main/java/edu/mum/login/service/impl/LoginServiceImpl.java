package edu.mum.login.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.mum.login.dao.LoginDao;
import edu.mum.login.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	private LoginDao loginDao;
	
	@Override
	public boolean authenticateUser(String userName, String password) {		
		return loginDao.authenticateUser(userName, password);
	}

}
