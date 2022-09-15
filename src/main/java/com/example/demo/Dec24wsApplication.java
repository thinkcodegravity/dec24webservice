package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@ComponentScan({"com.tutorial.webservice.rest.controller","mvc.aspects","mvc.controller.ui","mvc.service"})
@EnableJpaRepositories("mvc.dataAccessLayer")
@EntityScan({"mvc.dataAccessLayer"})
@EnableTransactionManagement
public class Dec24wsApplication {

	public static void main(String[] args) {
		SpringApplication.run(Dec24wsApplication.class, args);
	}

}
