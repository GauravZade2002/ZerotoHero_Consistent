package com.admin.microservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {
	
	@Autowired
	private Environment env;
		
	@GetMapping("/pay")
	public String doPayment() {
		String port = env.getProperty("local.server.port");
		return "Payment has been processed "+port;
	}
}
