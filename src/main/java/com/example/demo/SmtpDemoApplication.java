package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SmtpDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SmtpDemoApplication.class, args);
		System.out.println("Its working..");
	}

}
