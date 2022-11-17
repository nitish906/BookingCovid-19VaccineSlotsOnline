package com.covid.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.covid.exception.SigninException;
import com.covid.model.AdminSignin;
import com.covid.model.UserSignin;
import com.covid.service.AdminService;
import com.covid.service.UserService;

@RestController
@RequestMapping("/signup")
public class SignupController {
	@Autowired
	private UserService userService;
	
	@Autowired
	private AdminService adminService;
	
	@PostMapping("/user")
	public UserSignin saveUser(@RequestBody UserSignin user) throws SigninException {
		return userService.createUser(user);
	}
	
//	@PutMapping("/userupdate")
//	public UserSignin updateUser(@RequestBody UserSignin user,@RequestParam String uuid) throws SigninException {
//		return userService.updateUser(user, uuid);
//	}
	
	@PostMapping("/admin")
	public AdminSignin saveAdmin(@RequestBody AdminSignin admin) throws SigninException {
		return adminService.createAdmin(admin);
	}
	
//	@PutMapping("/adminupdate")
//	public UserSignin updateUser(@RequestBody UserSignin user,@RequestParam String uuid) throws SigninException {
//		return userService.updateUser(user, uuid);
//	}
}
