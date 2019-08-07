package com.example.dockerJava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DockerJavaApplication {

	int a = 4;
	
	public static void main(String[] args) {
		SpringApplication.run(DockerJavaApplication.class, args);
	}

}
