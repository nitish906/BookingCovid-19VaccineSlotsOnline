package com.covid.model;

import javax.validation.constraints.Digits;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AdharCard {
	
	@Digits(integer = 12,fraction = 12,message = "Length must be 12")
	private long adharNo;

}
