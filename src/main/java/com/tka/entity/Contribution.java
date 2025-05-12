package com.tka.entity;

import org.apache.catalina.User;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import jakarta.persistence.Id;
@Entity
@Data

public class Contribution {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	@ManyToOne
	 private User Contrubution;
	@ManyToOne
	 private Project project;
	private String  description;
	private  Data contrubution;
	
	
	
}
