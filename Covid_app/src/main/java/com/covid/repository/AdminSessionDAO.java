package com.covid.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.covid.model.CurrentAdminSession;

@Service
public interface AdminSessionDAO extends JpaRepository<CurrentAdminSession, Integer>{
public Optional<CurrentAdminSession> findByAdminId(Integer userId);
	
	public Optional<CurrentAdminSession> findByUuid(String uuid);
}
