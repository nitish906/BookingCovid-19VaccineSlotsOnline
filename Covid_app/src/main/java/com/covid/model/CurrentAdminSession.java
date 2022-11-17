package com.covid.model;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@NoArgsConstructor
@Data
@ToString
public class CurrentAdminSession {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column(unique = true)
	private Integer adminId;
	private String uuid;
	private LocalDateTime dateTime;
	public CurrentAdminSession(Integer adminId, String uuid, LocalDateTime dateTime) {
		super();
		this.adminId = adminId;
		this.uuid = uuid;
		this.dateTime = dateTime;
	}
	
	
	
	
}
