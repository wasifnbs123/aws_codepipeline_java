package com.example.dockerJava.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	@GetMapping(path = "/demo")
	public String getdemo() {
		return "Hello Gee Terraform";
}
}
