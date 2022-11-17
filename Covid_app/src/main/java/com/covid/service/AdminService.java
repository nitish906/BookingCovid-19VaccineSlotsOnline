package com.covid.service;


import com.covid.exception.SigninException;
import com.covid.model.AdminSignin;

public interface AdminService {
	public AdminSignin createAdmin(AdminSignin user) throws SigninException;
}
