package com.covid.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.covid.model.Vaccine;
import com.covid.model.VaccineCount;


@Repository
public interface VaccineCountDao extends JpaRepository<VaccineCount, Integer>{

	VaccineCount findByvaccine(Vaccine vaccine);

	VaccineCount findByvaccineId(Integer vaccineid);

	

	
}
