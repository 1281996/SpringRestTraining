package com.cog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cog.entity.User;
import com.cog.service.UserService;

@RestController
public class UserController {
	@Autowired
	UserService userService;
	//get all registered users
	@GetMapping("/allUsers")
	List<User> getAllUsers(){
		return userService.findAllUsers();
		
	}
	//user registration
	@PostMapping("/register")
	User saveUser(@RequestBody User user){
		return userService.registerUser(user);
		
	}
}
