package com.covid.service;

import com.covid.exception.IdCardException;
import com.covid.exception.IdCardNotFoundException;
import com.covid.model.IdCard;

public interface IdCardService {

	public IdCard getIdcardByPanNo(String panNo,String key) throws IdCardNotFoundException;

	public IdCard getIdCardByAdharNo(Long adharno,String key) throws IdCardNotFoundException;

	public IdCard addIdCard(IdCard idCard) throws IdCardException;
}
