package com.covid.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.covid.exception.LoginException;
import com.covid.exception.LogoutException;
import com.covid.model.AdminLogin;
import com.covid.model.UserLogin;
import com.covid.service.AdminLoginService;
import com.covid.service.UserLoginService;

@RestController
public class LoginLogoutController {
	@Autowired
	private UserLoginService userLoginService;
	
	@Autowired
	private AdminLoginService adminLoginService;
	
	
	@PostMapping("/userLogin")
	public String loginUser(@RequestBody UserLogin user) throws LoginException {
		return userLoginService.loginUserAccount(user);
	}
	
	@PatchMapping("/userLogout")
	public String logoutUser(@RequestParam(required = false) String uuid) throws LogoutException {
		return userLoginService.logoutUserAccount(uuid);
	}
	
	@PostMapping("/adminLogin")
	public String loginAdmin(@RequestBody AdminLogin user) throws LoginException {
		return adminLoginService.loginAdminAccount(user);
	}
	
	@PatchMapping("/adminLogout")
	public String logoutAdmin(@RequestParam(required = false) String uuid) throws LogoutException {
		return adminLoginService.logoutAdminAccount(uuid);
	} 
}
