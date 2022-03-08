package com.property.property.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("login")
public class LoginControlller {

	@GetMapping("/welcome")
	public ResponseEntity<Object> welcome(){
		return ResponseEntity.ok("Welcome to property dealers");
	}
}
