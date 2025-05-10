package com.tka.entity;

import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class UserEntity {
	private  Long id;
	private  String username;
	private String email;
	private String  password;

}
