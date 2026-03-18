package com.admin.microservice.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityController {
	@GetMapping("/api/login")
	public String login() {
		return "welcome to the login  page";
	}

}
