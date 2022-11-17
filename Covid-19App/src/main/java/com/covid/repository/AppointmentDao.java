package com.covid.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.covid.model.Appointment;
import com.covid.model.Member;



public interface AppointmentDao extends JpaRepository<Appointment, Long> {

	List<Appointment> findByMember(Member member);

}
