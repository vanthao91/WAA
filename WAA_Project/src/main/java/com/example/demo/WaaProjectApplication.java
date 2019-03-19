package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages= {"com.example.demo.controller","service","storage"})
public class WaaProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(WaaProjectApplication.class, args);
	}

}
