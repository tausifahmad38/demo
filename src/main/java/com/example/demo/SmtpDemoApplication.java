package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SmtpDemoApplication implements CommandLineRunner{
	
	@Autowired
	private MailService emailService;
	
	public String sendEmail() {
		String to = "ahmadtausif38@gmail.com";
		String subject = "Hello from Spring Boot";
		String text = "<h1>Hello there!</h1><p>This is a sample email sent from a Spring Boot application.</p>";
		emailService.sendEmail(to, subject, text);
		return "Email sent successfully!";
	}

	public static void main(String[] args) {
		SpringApplication.run(SmtpDemoApplication.class, args);
		System.out.println("Its working..");
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		this.sendEmail();
	}

}
