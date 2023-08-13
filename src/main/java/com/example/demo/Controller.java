//package com.example.demo;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//public class Controller {
//
//	@Autowired
//	private MailService emailService;
//
//	@GetMapping("/ch")
//	public String chk() {
//		return "HI";
//	}
//	
//	
//	@GetMapping("/sendEmail")
//	public String sendEmail() {
//		String to = "ahmadtausif38@gmail.com";
//		String subject = "Hello from Spring Boot";
//		String text = "<h1>Hello there!</h1><p>This is a sample email sent from a Spring Boot application.</p>";
//		emailService.sendEmail(to, subject, text);
//		return "Email sent successfully!";
//	}
//}
