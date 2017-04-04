package com.main.domain;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional 
public interface UserDAO extends CrudRepository<User, Long> {
	
	public User findById (int id);
	public User findByUsername (String username);
	public User findByEmail (String email);
	public User findBySalt (byte[] salt);
	
}