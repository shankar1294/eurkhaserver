package com.example.eurekhaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekhaserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekhaserverApplication.class, args);
	}

}
