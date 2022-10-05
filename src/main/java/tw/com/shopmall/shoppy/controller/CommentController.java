package tw.com.shopmall.shoppy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import tw.com.shopmall.shoppy.member.CommentBean;
import tw.com.shopmall.shoppy.service.CommentService;

@RestController
public class CommentController {

	@Autowired
	private CommentService commentService;
	
	@GetMapping("/allcomment")
	private List<CommentBean> showcomments() {
		List<CommentBean> bean = commentService.select(null);
		return bean;
	}
	@PostMapping("/allcomment")
	private void insertcomments() {
		
	}
}