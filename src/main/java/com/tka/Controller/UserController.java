package com.tka.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.tka.DTO.UserDto;
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
	public ResponseEntity<String> login(@RequestBody UserDto userDto) {
		boolean isLoggeIn = userService.login(userDto);
		if (isLoggeIn) {
			return ResponseEntity.ok("Login successful!");
		}else {
		return ResponseEntity.status(401).body("Invalid username or password!");
		}
	}
	 @GetMapping("/{id}")
	 public ResponseEntity<String> getuserById(@PathVariable Long id){
		 User user = userService.getuserByid(id);
		 return ResponseEntity.ok("get by id sucessful");
		 }
	 

}
