package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringCloudRibbonServiceApplication {

	public static void main(String[] args) {

		/*
		 * Http Url : http://localhost:8091/getServerSideService or
		 * http://localhost:8092/getServerSideService or
		 * http://localhost:8093/getServerSideService
		 */
		SpringApplication.run(SpringCloudRibbonServiceApplication.class, args);
	}
}
