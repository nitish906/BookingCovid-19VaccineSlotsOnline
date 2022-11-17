package com.covid.exception;

public class IdCardNotFoundException extends RuntimeException {
	public IdCardNotFoundException() {
		
	}

	public IdCardNotFoundException(String message) {
		
		super(message);
	}
}
