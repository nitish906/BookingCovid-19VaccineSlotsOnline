package com.covid.service;

import java.time.LocalDateTime;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.covid.exception.LoginException;
import com.covid.exception.LogoutException;
import com.covid.model.CurrentUserSession;
import com.covid.model.UserLogin;
import com.covid.model.UserSignin;
import com.covid.repository.UserDAO;
import com.covid.repository.UserSessionDAO;

import net.bytebuddy.utility.RandomString;

@Service
public class UserLoginServiceImpl implements UserLoginService{

	@Autowired
	private UserDAO userDao;
	
	@Autowired
	private UserSessionDAO userSessionDao;
	@Override
	public String loginUserAccount(UserLogin userLogin) throws LoginException {
		Optional<UserSignin> opt = userDao.findByMobileNo(userLogin.getMobileNo());
		if(!opt.isPresent()) {
			throw new LoginException("please Enter valid mobile Number");
		}
		
		UserSignin user = opt.get();
		Integer userId = user.getId();
		
		Optional<CurrentUserSession> currUserSession = userSessionDao.findByUserId(userId);
		
		if(currUserSession.isPresent()) {
			throw new LoginException("User already logged in with this number");
		}
		if(user.getPassword().equals(userLogin.getPassword())) {
			String uuid = RandomString.make(6);
			CurrentUserSession currUserSession2 = new CurrentUserSession(userId, uuid , LocalDateTime.now());
			userSessionDao.save(currUserSession2);
			return currUserSession2.toString();
		}
		else {
			throw new LoginException("Enter valid Password");
		}
	}

	@Override
	public String logoutUserAccount(String uuid) throws LogoutException {
		Optional<CurrentUserSession> curreUserSess3 = userSessionDao.findByUuid(uuid);
		if(curreUserSess3.isPresent()) {
			CurrentUserSession currUser1 = curreUserSess3.get();
			
			userSessionDao.delete(currUser1);
			
			return "logged Out successfully";
		}
		else {
			throw new LogoutException("Enter correct uuid to logout");
		}
	}

}
