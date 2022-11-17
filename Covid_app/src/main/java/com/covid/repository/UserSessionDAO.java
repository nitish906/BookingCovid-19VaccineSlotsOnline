package com.covid.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.covid.model.CurrentUserSession;

public interface UserSessionDAO extends JpaRepository<CurrentUserSession, Integer>{
	public Optional<CurrentUserSession> findByUserId(Integer userId);
	
	public Optional<CurrentUserSession> findByUuid(String uuid);
}
