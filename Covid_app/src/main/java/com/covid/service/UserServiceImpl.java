

package com.covid.service;



import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.covid.exception.SigninException;
import com.covid.model.CurrentUserSession;
import com.covid.model.UserSignin;
import com.covid.repository.UserDAO;
import com.covid.repository.UserSessionDAO;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDAO userDao;
	
	@Autowired
	private UserSessionDAO userSessionDao;
	
	@Override
	public UserSignin createUser(UserSignin user) throws SigninException {
		Optional<UserSignin> opt = userDao.findByMobileNo(user.getMobileNo());
		
		if(opt.isPresent()) {
			throw new SigninException("User already Exist");
		}
		return userDao.save(user);
	}

	@Override
	public UserSignin updateUser(UserSignin user, String uuid) throws SigninException {
		Optional<CurrentUserSession> optCurrentUser = userSessionDao.findByUuid(uuid);
		
		if(!optCurrentUser.isPresent()) {
			throw new SigninException("Account with given uuid not found");
		}
		return userDao.save(user);
	}
	
}