package com.soham.trydbspringsecurity.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.soham.trydbspringsecurity.entites.SpringUser;
import com.soham.trydbspringsecurity.services.UserServices;

@RestController
public class SohamController {
	
	private final UserServices userServices;
	
	
	
	public SohamController(UserServices userServices) {
		super();
		this.userServices = userServices;
	}

	@GetMapping("/welcome")
	public String welcome()
	{
		return "welcome to spring security";
	}
	
	@PostMapping("/register")
	public SpringUser register(@RequestBody SpringUser user)
	{
		return userServices.register(user);
	}

}
