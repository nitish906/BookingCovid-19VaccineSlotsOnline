package com.covid.exception;

public class VaccineCenterNotFoundException extends RuntimeException {

	public VaccineCenterNotFoundException() {
		
	}

	public VaccineCenterNotFoundException(String message) {
		
		super(message);
	}
}
