package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.tutorial.webservice.rest")
public class Dec24wsApplication {

	public static void main(String[] args) {
		SpringApplication.run(Dec24wsApplication.class, args);
	}

}
