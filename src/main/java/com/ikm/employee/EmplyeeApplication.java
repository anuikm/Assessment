package com.ikm.employee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
public class EmplyeeApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmplyeeApplication.class, args);
	}

}
