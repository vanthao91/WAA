package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.service.StorageService;

@SpringBootApplication
public class WaaProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(WaaProjectApplication.class, args);
	}
	//for development only
	 @Bean
	    CommandLineRunner init(StorageService storageService) {
	        return (args) -> {
	            storageService.deleteAll();
	            storageService.init();
	        };
	    }

}
