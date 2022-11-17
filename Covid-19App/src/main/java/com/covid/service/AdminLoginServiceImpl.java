package com.covid.service;

import java.time.LocalDateTime;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.covid.exception.LoginException;
import com.covid.exception.LogoutException;
import com.covid.model.AdminLogin;
import com.covid.model.AdminSignin;
import com.covid.model.CurrentAdminSession;
import com.covid.repository.AdminDAO;
import com.covid.repository.AdminSessionDAO;

import net.bytebuddy.utility.RandomString;

@Service
public class AdminLoginServiceImpl implements AdminLoginService{

	@Autowired
	private AdminDAO adminDao;
	
	@Autowired
	private AdminSessionDAO adminSessionDao;
	
	@Override
	public String loginAdminAccount(AdminLogin adminLogin) throws LoginException {
		Optional<AdminSignin> opt = adminDao.findByMobileNo(adminLogin.getMobileNo());
		
		if(!opt.isPresent()) {
			throw new LoginException("Enter valid mobile Number");
		}
		
		AdminSignin adminSignin = opt.get();
		Integer adminId = adminSignin.getId();
		Optional<CurrentAdminSession> currAdminSession = adminSessionDao.findByAdminId(adminId);
		
		if(currAdminSession.isPresent()) {
			throw new LoginException("Admin Already logged in with this number");
		}
		
		if(adminSignin.getPassword().equals(adminLogin.getPassword())) {
			String uuid = RandomString.make(6);
			
			CurrentAdminSession currentAdminSession = new CurrentAdminSession(adminId, uuid, LocalDateTime.now());
			
			adminSessionDao.save(currentAdminSession);
			
			return currentAdminSession.toString();
		}
		else {
			throw new LoginException("Enter Valid Password");
		}
	}

	@Override
	public String logoutAdminAccount(String uuid) throws LogoutException {
Optional<CurrentAdminSession> currAdminOpt=adminSessionDao.findByUuid(uuid);
		
		if(currAdminOpt.isPresent()) {
			CurrentAdminSession currAdmin1=currAdminOpt.get();
			
			adminSessionDao.delete(currAdmin1);
			return "Admin logged out successfully.";
		}
		throw new LogoutException("Admin does not exist, Enter correct uuid");
	}

}
