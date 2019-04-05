package com.danielniko.crudbudget;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class CrudbudgetApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudbudgetApplication.class, args);
	}

}
