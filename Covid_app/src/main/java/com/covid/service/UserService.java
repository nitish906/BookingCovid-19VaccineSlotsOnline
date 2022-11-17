package com.covid.service;

import com.covid.model.UserSignin;

import com.covid.exception.SigninException;

public interface UserService {
	
	public UserSignin createUser(UserSignin user) throws SigninException;
	
	public UserSignin updateUser(UserSignin user, String uuid) throws SigninException;
}
