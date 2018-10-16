package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceController {

	@Autowired
	Environment environment;

	@GetMapping("/")
	public String health() {
		return "I am Ok";
	}

	@GetMapping("/getServerSideService")
	public String getServerSideService() {
		System.out.println("Inside SpringCloud-Ribbon-Service::getServerSideService...");

		String serverPort = environment.getProperty("local.server.port");

		System.out.println("Port : " + serverPort);

		return "Hello form SpringCloud-Ribbon-Service!!! " + " Host : localhost " + " :: Port : " + serverPort;
	}
}