package com.tka.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.Reporisetory.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;	
}
