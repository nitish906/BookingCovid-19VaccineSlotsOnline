package com.masai.module;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AdharCard {
	
	@Id
	//@Size(max = 12, message ="Addhar card number length is maximum 12!")
	//@Pattern(regexp = "^[2-9]{1}[0-9]{3}\\s[0-9]{4}\\s[0-9]{4}$", message = "Adhar card Number is Invalid!")
	@Digits(integer = 12,fraction = 12,message = "Length must be 12")
	private long panoNo;
}
