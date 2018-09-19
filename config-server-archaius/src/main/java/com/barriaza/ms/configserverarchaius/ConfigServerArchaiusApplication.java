package com.barriaza.ms.configserverarchaius;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigServerArchaiusApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServerArchaiusApplication.class, args);
	}
}
