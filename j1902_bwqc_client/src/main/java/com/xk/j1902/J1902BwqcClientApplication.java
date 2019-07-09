package com.xk.j1902;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class  J1902BwqcClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(J1902BwqcClientApplication.class, args);
	}

}
