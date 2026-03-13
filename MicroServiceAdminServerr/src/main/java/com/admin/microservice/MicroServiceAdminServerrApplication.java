package com.admin.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

@SpringBootApplication
@EnableAdminServer
public class MicroServiceAdminServerrApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroServiceAdminServerrApplication.class, args);
	}

}
