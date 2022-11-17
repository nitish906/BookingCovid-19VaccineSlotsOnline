package com.covid.exception;

public class VaccineInventoryNotFoundException extends RuntimeException{

	public VaccineInventoryNotFoundException() {
		super();
		
	}

	public VaccineInventoryNotFoundException(String message) {
		super(message);
		
	}

	
}
