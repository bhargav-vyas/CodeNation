package com.tka.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tka.Entity.User;
import com.tka.Service.UserService;

@RestController
@RequestMapping("/auth")
public class UserController {
	@Autowired
	private UserService userService;
	
	@PostMapping("/resister")
	 public ResponseEntity<String>  resistration(@RequestBody User user){
		userService.resistration(user);
		return ResponseEntity.ok("user resistration sucessful;");
	}
	@PostMapping("/login")
	public User login (@RequestBody)
	

}
