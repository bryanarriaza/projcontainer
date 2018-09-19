package com.barriaza.ms.microservicehelloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MicroserviceHelloworldApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceHelloworldApplication.class, args);
	}

}
