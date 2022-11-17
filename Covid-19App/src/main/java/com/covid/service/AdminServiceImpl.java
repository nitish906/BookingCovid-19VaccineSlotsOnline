package com.covid.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.covid.exception.SigninException;
import com.covid.model.AdminSignin;
import com.covid.model.UserSignin;
import com.covid.repository.AdminDAO;
import com.covid.repository.AdminSessionDAO;

@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	private AdminDAO adminDao;

	@Autowired
	private AdminSessionDAO adminSessionDao;

	@Override
	public AdminSignin createAdmin(AdminSignin user) throws SigninException {
		Optional<AdminSignin> opt = adminDao.findByMobileNo(user.getMobileNo());

		if (opt.isPresent()) {
			throw new SigninException("User already Exist");
		}
		return adminDao.save(user);
	}

}
