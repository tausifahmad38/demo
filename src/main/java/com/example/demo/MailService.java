package com.example.demo;

import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

@Service
public class MailService {

	@Autowired
	private JavaMailSender javaMailSender;

	public void sendEmail(String to, String subject, String text) {
		try {
			MimeMessage message = javaMailSender.createMimeMessage();
			MimeMessageHelper helper = new MimeMessageHelper(message, true);
			helper.setFrom("springexample9@gmail.com");
			helper.setTo(to);
			helper.setSubject(subject);
			helper.setText(text, true); // true indicates HTML content
			javaMailSender.send(message);
		} catch (Exception e) {
// Handle exception appropriately
			e.printStackTrace();
		}
	}
}
