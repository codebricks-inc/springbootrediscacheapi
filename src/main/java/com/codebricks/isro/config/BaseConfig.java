package com.codebricks.isro.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class BaseConfig {

    @Bean
    RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
