package com.sop.chapter6.testservice1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class TestService1Application {

	public static void main(String[] args) {
		SpringApplication.run(TestService1Application.class, args);
	}

}
