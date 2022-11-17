package com.covid.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.covid.model.AdharCard;
import com.covid.model.IdCard;
import com.covid.model.PanCard;


public interface IdCardDao extends JpaRepository<IdCard, Integer> {

	public IdCard findByPancard(PanCard pancard);

	public IdCard findByAdharcard(AdharCard adharcard);

	

	

	

}
