package com.pe.ribbon.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("api/v1/rb")
public class TestRibbonController {
	
	@LoadBalanced
	@Bean
	RestTemplate restTemplate() {
		return new RestTemplate();
	}

	@Autowired
	RestTemplate restTemplate;
	
	@GetMapping("/client")
	public String test() {
		System.out.println("Response from Test Method ...");

		String teststring = this.restTemplate().getForObject("http://localhost:8765/newsrbnservice/ribbon", String.class);

		return "Server Response ::" + teststring;
	}

}
