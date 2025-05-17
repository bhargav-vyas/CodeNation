package com.tka.Service;

import java.util.Optional;

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

	public User getuserByid(Long id) {
		return userRepository.getById(id);
	}

	public String updateUserById(Long id, UserDto userdto) {
		Optional<User> optionalUser =userRepository.findById(id);
		if (optionalUser.isPresent()) {
			User user =optionalUser.get();
			user.setUsername(userdto.getUsername());
			user.setPassword(userdto.getPassword());
			user.setEmail(user.getEmail());
			userRepository.save(user);
			return "user update succesfully";
		}else {
			return "User not found with Id " + id ;
		}
	}	
}
