package com.tka.Entity;

import org.hibernate.mapping.UniqueKey;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
@Data
@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private  Long id;
	private  String username;
	@Column(unique = true)
	private String email;
	private String  password;

}
