package tw.com.shopmall.shoppy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import tw.com.shopmall.shoppy.service.MailService;

@RestController
public class MailController {
  
	@Autowired
 private MailService mailService;
 
 @GetMapping("/mail/{memmail}")
 public void hello(@PathVariable String memmail){
	 mailService.prepareAndSend(memmail,"Sample mail subject");
 }
 
 @GetMapping("/comment/{memmail}")
 public String comment(@PathVariable String memmail){
	 mailService.comments(memmail,"Sample mail subject");
  return "redirect:/fix.html";
 }
 @GetMapping("/discount/{memmail}")
 public String discount(@PathVariable String memmail){
	 mailService.discount(memmail,"Sample mail subject");
  return "redirect:/index.html";
 }
 

}