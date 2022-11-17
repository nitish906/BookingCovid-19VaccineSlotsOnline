package com.covid.service;

import java.util.List;

import org.springframework.stereotype.Service;
import com.covid.model.Vaccine;


@Service
public interface VaccineService {

	public List<Vaccine> allVaccine(String key);

	public Vaccine getVaccineByName(String VaccineName,String key);

	public Vaccine getVaccineById(Integer vaccineId,String key);

	public Vaccine addVaccine(Vaccine vaccine,String key);

	public Vaccine updateVaccine(Vaccine vaccine,String key);

	public boolean deleteVaccine(Vaccine vaccine,String key);

}
