package com.rahul.bootproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@SpringBootApplication
//@EnableJpaRepositories("com.rahul.bootproject.um.dao")
//@EntityScan("com.rahul.bootproject.um.model")
//@EnableConfigurationProperties
//@ConfigurationProperties
/*@PropertySources({
    @PropertySource("classpath:application.properties") })*/
public class BootprojectStarter {

	public static void main(String[] args) {
		System.out.println("Going to start context");
		SpringApplication.run(BootprojectStarter.class, args);
		System.out.println("Started Up");
	}

}