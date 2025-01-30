package com.soham.trydbspringsecurity.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.soham.trydbspringsecurity.entites.SpringUser;
import com.soham.trydbspringsecurity.repositories.UserRepository;

@Service
public class UserServices {
	
	private UserRepository userRepo;
	private BCryptPasswordEncoder bCryptPasswordEncoder;
		
	public UserServices(UserRepository userRepo, BCryptPasswordEncoder bCryptPasswordEncoder) {
		super();
		this.userRepo = userRepo;
		this.bCryptPasswordEncoder = bCryptPasswordEncoder;
	}




	public SpringUser register(SpringUser user)
	{
		user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
		return userRepo.save(user);
	}

}
