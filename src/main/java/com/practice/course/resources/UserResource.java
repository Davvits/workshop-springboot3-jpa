package com.practice.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practice.course.entities.User;

@RestController
@RequestMapping(value = "users")
public class UserResource {
	@GetMapping
	public ResponseEntity<User> findAll(){
	User u =  new User(1L,"maria","maria@gmail.com",null,"123");
	return ResponseEntity.ok().body(u);
	}
}
