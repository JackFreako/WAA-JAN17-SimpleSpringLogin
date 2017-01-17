package edu.mum.login.dao;

public interface LoginDao {
	public boolean authenticateUser(String userName, String passWord);
}
