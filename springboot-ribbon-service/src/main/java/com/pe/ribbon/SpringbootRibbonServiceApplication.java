package com.pe.ribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringbootRibbonServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootRibbonServiceApplication.class, args);
	}

}
