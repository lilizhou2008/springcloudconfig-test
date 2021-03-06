package com.ocean.eureka.oceaneureka;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class OceanEurekaApplication {
	public static void main(String[] args) {
		new SpringApplicationBuilder(OceanEurekaApplication.class).web(true).run(args);
	}
}
