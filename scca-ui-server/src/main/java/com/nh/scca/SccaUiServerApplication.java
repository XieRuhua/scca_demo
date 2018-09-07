package com.nh.scca;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SccaUiServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SccaUiServerApplication.class, args);
	}
}
