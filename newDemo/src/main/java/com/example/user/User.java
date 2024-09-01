package com.example.user;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class User {

	@GetMapping("/add")
	public int addmark(@RequestParam("a") int op1, @RequestParam("b") int op2) {
		return op1+op2;
		
	}
}
