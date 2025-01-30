package com.soham.trydbspringsecurity.services;

import java.nio.file.attribute.UserPrincipalNotFoundException;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.soham.trydbspringsecurity.CustomUserDetails;
import com.soham.trydbspringsecurity.entites.SpringUser;
import com.soham.trydbspringsecurity.repositories.UserRepository;

@Component
public class CustomUserDetailsService implements UserDetailsService {

	
	private final UserRepository userRepo;
	
	
	public CustomUserDetailsService(UserRepository userRepo) {
		super();
		this.userRepo = userRepo;
	}


	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		SpringUser user=userRepo.findByUsername(username);
		if(user==null)
		{
			System.out.println("not found");
			throw new UsernameNotFoundException("not found");
		}
		
		return new CustomUserDetails(user);
	}

}
