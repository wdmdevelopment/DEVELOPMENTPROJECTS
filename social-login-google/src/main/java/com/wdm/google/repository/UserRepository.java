package com.wdm.google.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wdm.google.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

	public User findByEmailId(String email);
	
	

}
