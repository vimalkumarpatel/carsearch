package com.vimalkumarpatel.carsearch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.web.config.EnableSpringDataWebSupport;

@EnableJpaRepositories
@SpringBootApplication
public class CarsearchApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarsearchApplication.class, args);
	}

}

