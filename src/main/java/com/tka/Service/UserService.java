package com.tka.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.DTO.UserDto;
import com.tka.Entity.User;
import com.tka.Reporisetory.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public void resistration(User user) {
		userRepository.save(user);
		
	}

	public boolean login(UserDto userDto) {
		return false;
	}	
}
