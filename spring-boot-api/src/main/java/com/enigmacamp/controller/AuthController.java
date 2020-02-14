package com.enigmacamp.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.enigmacamp.model.User;

@RestController
public class AuthController {
	@PostMapping("/login")
	public ResponseEntity<User> doAuthenticate(@RequestBody User user) {
		if (user.getUsername().equals("user") && user.getPassword().equals("123")) {
			User userInfo = new User();
			userInfo.setFullname("Rahadi Oemar");
			userInfo.setAddress("Jl. H. Dahlan No. 75");
			HttpHeaders headers = new HttpHeaders();
			headers.add("Set-Cookie", "session=abcdefg");
			return new ResponseEntity(userInfo, headers, HttpStatus.OK);
		} else {
			return new ResponseEntity(HttpStatus.UNAUTHORIZED);
		}
	}
}