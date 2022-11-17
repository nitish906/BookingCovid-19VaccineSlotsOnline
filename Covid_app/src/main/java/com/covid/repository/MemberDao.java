package com.covid.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.covid.model.IdCard;
import com.covid.model.Member;
import com.covid.model.VaccineRegistration;


public interface MemberDao extends JpaRepository<Member, Integer> {

	
	public Member findByIdCard(Optional<IdCard> idcard);

	


	public Member findByvaccineRegistration(VaccineRegistration vr);

}
