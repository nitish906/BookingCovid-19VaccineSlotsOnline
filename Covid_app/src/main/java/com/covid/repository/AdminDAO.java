package com.covid.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.covid.model.AdminSignin;

@Repository
public interface AdminDAO extends JpaRepository<AdminSignin, Integer>{
	public Optional<AdminSignin> findByMobileNo(String mobileNo);
}
