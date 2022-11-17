package com.covid.model;

import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class AdminLogin {
	
	@NotNull(message = "Mobile No is required")
	private String mobileNo;
	
	
	@NotNull(message = "Password is required")
	private String password;
}
