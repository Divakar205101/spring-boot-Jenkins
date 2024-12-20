package com.diva.springboot_jenkins;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class SpringbootJenkinsApplication {
	
	
	private static final Logger log = LoggerFactory.getLogger(SpringbootJenkinsApplication.class);

	@PostConstruct
	public void init() {
		log.info("Application Started......");
	}

	public static void main(String[] args) {
		log.info("Application executed......");
		SpringApplication.run(SpringbootJenkinsApplication.class, args);
	}

}
