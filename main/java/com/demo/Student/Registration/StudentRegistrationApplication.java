package com.demo.Student.Registration;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@ComponentScan(basePackages = "com.demo.Student.Registration")
@EnableScheduling
@EnableConfigurationProperties
public class StudentRegistrationApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentRegistrationApplication.class, args);
	}
	

}
