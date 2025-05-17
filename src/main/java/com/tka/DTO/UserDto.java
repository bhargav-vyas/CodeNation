package com.tka.DTO;

import jakarta.persistence.Column;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;

public class UserDto {
	private  Long id;
	 @Size(min = 2, max = 50, message = "Name must be between 2-50 characters")
	private  String username;
	 @Email(message = "EmailShould be valid")
	private String email;
	 @Size(min = 8 , max= 100 ,message = "password must be between 8-100 charactrs")
	private String  password;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	
}
