package com.covid.exception;

public class AppointmentExcepation extends RuntimeException{

	public AppointmentExcepation() {
		super();
		
	}

	public AppointmentExcepation(String message) {
		super(message);
		
	}

}
