package com.educandoweb.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.course.entities.User;
@RestController //necessary to identify like a rest controller
@RequestMapping(value="/users") //identified by url localhost:8080/user
public class UserResource {
	@GetMapping //used to response a get method
	public ResponseEntity<User> findAll(){
		User u = new User(1L, "Igor", "igor@gmail.com", "11111", "11111");
		return ResponseEntity.ok().body(u);
	}
}
