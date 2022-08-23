package com.cog.controller;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cog.entity.User;
import com.cog.service.UserService;

@RestController
public class UserController {
	
	Log LOGGER =LogFactory.getLog(UserController.class);
	@Autowired
	UserService userService;
	//get all registered userss
	@GetMapping("/allUsers")
	List<User> getAllUsers(){
		return userService.findAllUsers();
		
	}
	//user registration
	@PostMapping("/register")
	User saveUser(@RequestBody User user){
		LOGGER.trace(user);
		return userService.registerUser(user);
		
	}
	//user path variable checking
		@PostMapping("/user/age/{age}/height/{height}")
		User saveUser(@RequestBody User user,@PathVariable("age") int age,@PathVariable("height") float height ){
			LOGGER.trace(user);
			System.out.println(age+"-"+height);
			return null;
			
		}
}
