package com.admin.microservice.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

	@Autowired
	FiegnClientInterface fi;
	
	@GetMapping("/api/order")
	public String getOrder() {
		System.out.println("Inside the Order method");
		return fi.doPayment();
		//return "Payment method has been invoked";
	}
	
}
