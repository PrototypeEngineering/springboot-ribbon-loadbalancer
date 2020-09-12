package com.pe.ribbon.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

import com.pe.ribbon.client.config.RibbonConfiguration;

@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name="springboot-ribbon-service", configuration = RibbonConfiguration.class)
public class SpringbootRibbonClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootRibbonClientApplication.class, args);
	}

}
