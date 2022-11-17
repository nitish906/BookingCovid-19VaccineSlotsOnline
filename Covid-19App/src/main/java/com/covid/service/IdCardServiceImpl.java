package com.covid.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import com.covid.exception.IdCardException;
import com.covid.exception.IdCardNotFoundException;
import com.covid.exception.MemberNotFoundException;
import com.covid.model.AdharCard;
import com.covid.model.CurrentAdminSession;
import com.covid.model.IdCard;
import com.covid.model.PanCard;
import com.covid.repository.AdminSessionDAO;
import com.covid.repository.IdCardDao;



@Service
public class IdCardServiceImpl implements IdCardService {

	@Autowired
	private IdCardDao idDao;

	@Autowired
	private AdminSessionDAO adminSessionDAO;
	
	@Override
	public IdCard getIdcardByPanNo(String panNo,String key) throws MemberNotFoundException {

		 Optional<CurrentAdminSession> optCurrAdmin= adminSessionDAO.findByUuid(key);
			
			if(!optCurrAdmin.isPresent()) {
				
				throw new RuntimeException("Unauthorised access");
			}
		
		
		IdCard idcard = idDao.findByPancard(new PanCard(panNo));
		if (idcard == null)
			throw new IdCardNotFoundException("Idcard not found with the  panNo:" + panNo);
		else
			return idcard;
	}

	@Override
	public IdCard getIdCardByAdharNo(Long adharno,String key) throws MemberNotFoundException {

		 Optional<CurrentAdminSession> optCurrAdmin= adminSessionDAO.findByUuid(key);
			
			if(!optCurrAdmin.isPresent()) {
				
				throw new RuntimeException("Unauthorised access");
			}
		
		IdCard idcard = idDao.findByAdharcard(new AdharCard(adharno));
		if (idcard == null)
			throw new IdCardNotFoundException("IdCard not found with the adharNo :" + adharno);
		else
			return idcard;
	}

	@Override
	public IdCard addIdCard(IdCard idCard) {
		IdCard id = idDao.findByPancard(idCard.getPancard());
		if (id != null)
			throw new IdCardException("Id card already exist with the id : " + idCard.getPancard());
		IdCard id2 = idDao.findByAdharcard(idCard.getAdharcard());
		if (id2 != null)
			throw new IdCardException("Id card already exist with the id : " + idCard.getAdharcard());

		return idDao.save(idCard);
	}

}