package com.sohamglobal.springsecurity.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sohamglobal.springsecurity.entities.SpringUser;
import com.sohamglobal.springsecurity.services.UserServices;

@RestController
public class UserController {
	
	@Autowired
	private UserServices userServices;
	
	@GetMapping("/welcome")
	public String welcome()
	{
		return "welcome to sohamglobal spring security";
	}
	
	@PostMapping("/register")
	public SpringUser register(@RequestBody SpringUser user)
	{
		return userServices.addNewUser(user);
	}

}
