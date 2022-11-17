package com.covid.model;

import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
public class UserLogin {
	
	@NotNull(message = "Mobile is required")
	private String mobileNo;
	
	@NotNull(message = "Password is required")
	private String password;
}
