package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ClientController {
	
	@LoadBalanced
	@Bean
	RestTemplate restTemplate() {
		return new RestTemplate();
	}

	@Autowired
	RestTemplate restTemplate;

	@RequestMapping("/getClient")
	public String getClient() {
		/*
		 * This function is used for to call server side api
		 * serverSideIps is configured in applcation.yml
		 * For Ex : http://localhost:9091/getServerSideService or http://localhost:9092/getServerSideService or http://localhost:9093/getServerSideService
		 */
		return this.restTemplate.getForObject("http://serverSideIps/getServerSideService", String.class);
	}
}