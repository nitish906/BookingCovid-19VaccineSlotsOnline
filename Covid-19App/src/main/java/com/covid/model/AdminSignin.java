package com.covid.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AdminSignin {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@NotNull(message = "Name is required")
	private String name;
	
	@Column(unique = true)
	@Size(max = 10,min = 10)
	@NotNull(message = "Mobile is required")
	private String mobileNo;
	
	@NotNull(message = "Password is required")
	private String password;
	
	@Email(message="Enter your Email properly")
	@NotNull(message = "Email is required")
	private String email;
}