package com.leandro.leandro.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.leandro.leandro.enties.User;

@RestController
@RequestMapping(value = "/users")
public class UserResources {
	
	@GetMapping
	public ResponseEntity<User> findAll() {
		User u = new User(1L, "Leo", "leo@gmail.com", "999999999", "12345");
		return ResponseEntity.ok().body(u);
	}

}
