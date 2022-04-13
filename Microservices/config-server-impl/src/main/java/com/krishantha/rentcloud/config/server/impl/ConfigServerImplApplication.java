package com.krishantha.rentcloud.config.server.impl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigServerImplApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServerImplApplication.class, args);
	}

}
