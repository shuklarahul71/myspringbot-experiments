package com.rahul.bootproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.rahul.bootproject.um.dao")
@EntityScan("com.rahul.bootproject.um.model")
public class BootprojectStarter {

	public static void main(String[] args) {
		System.out.println("Going to start context");
		SpringApplication.run(BootprojectStarter.class, args);
		System.out.println("Started Up");
	}

}
