package com.ktb.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@Autowired
	ConfigServerProperties configServerProperties;
	
	@GetMapping("/hello")
	public String sayHello() {
		return "Hello! Config Server Data: "+configServerProperties.getData();
	}

}
