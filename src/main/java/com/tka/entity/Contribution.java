package com.tka.entity;

import org.apache.catalina.User;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Contribution {

	private Long Id;
	@ManyToOne
	 private User Contrubution;
	@ManyToOne
	 private Project project;
	private String  description;
	private  Data contrubution;
	
	
	
}
