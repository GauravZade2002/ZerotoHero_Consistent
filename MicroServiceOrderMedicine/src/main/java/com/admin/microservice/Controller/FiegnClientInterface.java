package com.admin.microservice.Controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="MicroServicePayment")
public interface FiegnClientInterface {
	@GetMapping("/pay")
	public String doPayment();
}
