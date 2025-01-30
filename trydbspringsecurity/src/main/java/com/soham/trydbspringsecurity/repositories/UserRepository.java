package com.soham.trydbspringsecurity.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.soham.trydbspringsecurity.entites.SpringUser;

public interface UserRepository extends JpaRepository<SpringUser, String> {

	SpringUser findByUsername(String username);
}
