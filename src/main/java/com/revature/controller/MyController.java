package com.revature.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	@GetMapping("/greet")
	public String hello() {
		return "Hello Rajesh";
	}
	@GetMapping("/users")
	public List<User> getAllUsers() {
		return Arrays.asList(new User(100,"Rajesh"),new User(101,"ajay"));
	}
}
