package com.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	@GetMapping("/meaasge")
	public String getMessage() {
		return "welcome to pankaj sir Academy-Bengaluru";
	}

}
