package com.sohamglobal.springsecuritybasic.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmpController {
	
	@GetMapping("/")
	public String welcome()
	{
		return "welcome to sohamglobal";
	}

}
