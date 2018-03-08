package com.jiminy.cloud.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

//import com.jiminy.cloud.dao.UserRepository;

@RestController
public class UserController {
	@Autowired
	private UserRepository userRepository; 
	
	@GetMapping("/{id}")
	public User findById(@PathVariable Integer id) {
		User findOne = this.userRepository.findOne(id);
		return findOne;
	}
	
}
