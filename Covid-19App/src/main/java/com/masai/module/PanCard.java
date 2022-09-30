package com.masai.module;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PanCard {
	
	@Id
	@Size(max = 10, message = "Pan Card Number Length is Maximum Should Be 10!")
	@Pattern(regexp ="[A-Z]{5}[0-9]{4}[A-Z]{1}",message="Pan Card Number is Invalid!")
	private String panNo;
	

}
