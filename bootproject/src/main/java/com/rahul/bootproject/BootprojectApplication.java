package com.rahul.bootproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BootprojectApplication {

	public static void main(String[] args) {
		System.out.println("Going to start context");
		SpringApplication.run(BootprojectApplication.class, args);
		System.out.println("Started Up");
	}

}
