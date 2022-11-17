package com.covid.service;

import com.covid.exception.LoginException;
import com.covid.exception.LogoutException;
import com.covid.model.UserLogin;

public interface UserLoginService {
	public String loginUserAccount(UserLogin userLogin) throws LoginException;
	
	public String logoutUserAccount(String uuid) throws LogoutException;
}
