package com.example.Constats;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ConstatsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConstatsApplication.class, args);
	}

}
