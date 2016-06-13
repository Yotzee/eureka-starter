package com.eureka.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaStarterApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaStarterApplication.class, args);
	}
}
