package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RibbonRestController{
	@Autowired
	Environment environment;
	
	@GetMapping("/")
	public String health() {
		return "I am ok";
		
	}
	@GetMapping("/backend")
	public String backend() {
		System.out.println("Inside MyRestController: : backend...");
		String serverport =environment.getProperty("local.server.port");
		return "hello from backend !!! "+"host : localhost "+" :: Port : "+serverport;
	}
	
}