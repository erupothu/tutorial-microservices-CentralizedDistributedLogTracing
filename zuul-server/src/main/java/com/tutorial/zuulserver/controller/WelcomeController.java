package com.tutorial.zuulserver.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	
	@GetMapping(value="welcome")
	public ResponseEntity<?> welcome() {
		
		return ResponseEntity.ok("welcome to Zuul seraver");
	}

}
