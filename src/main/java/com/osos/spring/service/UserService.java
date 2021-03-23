package com.osos.spring.service;

import com.osos.spring.entities.User;

public interface UserService {
	  
	 public User findUserByEmail(String email);
	 
	 public void saveUser(User user);
	}
