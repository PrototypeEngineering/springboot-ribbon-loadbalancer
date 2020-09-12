package com.pe.ribbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RibbonTestController {
	
	@Autowired
	Environment env;

	@GetMapping("/")
	public String mydetails() {
		return "Response from Ribbon Server ......";
	}

	@GetMapping("/ribbon")
	public String RibbonResponse() {
		System.out.println("Inside the RibbonController method .....");

		String portdetails = env.getProperty("local.server.port");

		System.out.println("Port" + portdetails);

		return "This message is from RibbonService " + "HostName :: localhost " + " Port ::" + portdetails;
	}

}
