package com.eureka.microserviceadminserver;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAdminServer
@EnableEurekaServer
public class MicroserviceAdminServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceAdminServerApplication.class, args);
    }

}
