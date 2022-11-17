package com.covid.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.covid.model.UserSignin;

public interface UserDAO extends JpaRepository<UserSignin, Integer>{
	public Optional<UserSignin> findByMobileNo(String mobileNo);
}
