package com.sohamglobal.springsecuritymultiusers.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SohamController {
	@GetMapping("/")
	public String welcome()
	{
		return "welcome to sohamglobal";
	}

}
