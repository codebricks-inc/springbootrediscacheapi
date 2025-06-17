package com.codebricks.isro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class IsroCentersAPI {

	public static void main(String[] args) {
		SpringApplication.run(IsroCentersAPI.class, args);
	}
}
