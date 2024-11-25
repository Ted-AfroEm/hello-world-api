package com.tedros.hello_world_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@SpringBootApplication
public class HelloWorldApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloWorldApiApplication.class, args);
	}

	@RequestMapping("/")
	public String helloWorld(){
		return "LMS Hello World...";
	}

}
