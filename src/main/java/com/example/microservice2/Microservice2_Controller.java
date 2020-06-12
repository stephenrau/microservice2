package com.example.microservice2;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/api/")
public class Microservice2_Controller {

	
	@GetMapping("get")
	public ResponseEntity<String> getUsers() {
		try {
			Thread.sleep(1500);
		} catch(InterruptedException e) {
		}
		return new ResponseEntity<String>("getting users", HttpStatus.OK);
	}

	/*
	@DeleteMapping("delete/{id}")
	public ResponseEntity<String> deleteUser() {
		
		return new ResponseEntity<String>("getting users", HttpStatus.OK);
	}

	@PostMapping("create")
	public ResponseEntity<String> createUser() {
		
		return new ResponseEntity<String>("creating user", HttpStatus.OK);
	}
*/
}
