package com.net.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {
	
	@Autowired
	private JavaMailSender mailSender;

   public void sendEmail(String email, String name)
   {
	   
	   SimpleMailMessage message = new SimpleMailMessage();
	   
	   message.setFrom("system.custommail@gmail.com");
	   message.setTo(email);
	   message.setSubject("New registration");
	   message.setText("Hi " + name + ", you have successfully registered yourself on helpdesk ticket management system." );
	   
	   
	   mailSender.send(message);
   }

}
