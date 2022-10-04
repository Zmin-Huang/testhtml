package tw.com.shopmall.shoppy;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

@SpringBootTest
public class MailTests {
 @Autowired
 JavaMailSender mailSender;
 @Test
 void sendToGmail() {
  SimpleMailMessage message = new SimpleMailMessage();  
  
  message.setTo("dnf94879487@gmail.com","dnf54875487@gmail.com");
  message.setSubject("測試透過 Gmail 去發信");
  message.setText("你好87");
  
  mailSender.send(message);
 }
}