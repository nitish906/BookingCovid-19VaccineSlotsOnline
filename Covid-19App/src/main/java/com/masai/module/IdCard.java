package com.masai.module;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class IdCard {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@NotNull(message = "Name Required")
	@NotBlank(message = "Name Required")
	private String name;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING ,pattern = "dd/MM/yyyy")
	@NotNull
	private LocalDate dob;
	
	@NotNull(message = "Gender Required ")
	private String gender;
	
	@NotNull(message = "Address required")
	@Pattern(regexp = "^[A-Z][a-z]*")
	private String address;
	
	@NotNull(message = "city required")
	private String city;
	
	@NotNull(message = "State required")
	private String state;
	
	@NotNull(message = "pincode shuold be required")
	@Size(min = 6, max = 6)
	private String pincode;
	
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "idCard")
	private Member member;
	
	
	
	@Embedded
	PanCard panCard;
	@Embedded
	AdharCard adharCard;
	
	

}
