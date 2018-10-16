package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@SpringBootApplication
@RibbonClient(name = "serverSideIps", configuration = Configuration.class)
public class SpringCloudRibbonClientApplication {

	/*
	 * Http Url : http://localhost:8090/getClient
	 * serverSideIps is configured in applcation.yml
	 */
	public static void main(String[] args) {
		SpringApplication.run(SpringCloudRibbonClientApplication.class, args);
	}
}
