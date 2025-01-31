package com.sohamglobal.springsecurity.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sohamglobal.springsecurity.entities.SpringUser;

@Repository
public interface UserRepository extends JpaRepository<SpringUser, String> {
	
	SpringUser findByUsername(String username);
}
