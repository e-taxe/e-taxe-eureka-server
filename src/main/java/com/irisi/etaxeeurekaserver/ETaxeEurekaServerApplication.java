package com.irisi.etaxeeurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ETaxeEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ETaxeEurekaServerApplication.class, args);
	}

}
