package tw.com.shopmall.shoppy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import tw.com.shopmall.shoppy.service.MailService;
@Controller
public class MailApiController {
	@Autowired
	 private MailService mailService;
	 
	
	@GetMapping("/comment")
	 public String comment(){
	  return "redirect:/contact.html";
	 }
}
