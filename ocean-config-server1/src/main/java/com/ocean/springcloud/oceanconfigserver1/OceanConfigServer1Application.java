package com.ocean.springcloud.oceanconfigserver1;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author pc
 */
@SpringBootApplication
@EnableConfigServer //开启Spring Cloud Config配置
@EnableEurekaClient
public class OceanConfigServer1Application {

	public static void main(String[] args) {
		SpringApplication.run(OceanConfigServer1Application.class, args);

	}
}
