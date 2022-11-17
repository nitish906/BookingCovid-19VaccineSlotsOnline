package com.covid.service;

import com.covid.exception.LoginException;
import com.covid.exception.LogoutException;
import com.covid.model.AdminLogin;

public interface AdminLoginService {
	public String loginAdminAccount(AdminLogin adminLogin) throws LoginException;
	
	public String logoutAdminAccount(String uuid) throws LogoutException;
}
