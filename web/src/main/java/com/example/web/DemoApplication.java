package com.example.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = { "com.example" })
@EntityScan(basePackages = { "com.example" })
@ComponentScan(basePackages = { "com.example" })
public class DemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class);
	}
}