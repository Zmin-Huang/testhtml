package tw.com.shopmall.shoppy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RoutingController {
	@RequestMapping(path = {"/"})
	public String method1() {
		return "/index.html";
	}
//	@RequestMapping(path = {"/member.html"})
//	public String method2() {
//		return "/templates/member";
//	}
//	@RequestMapping(path = {"/brands.html"})
//	public String method3() {
//		return "/brands";
//	}
//	@RequestMapping(path = {"/memberinfo.html"})
//	public String method4() {
//		return "/memberinfo";
//	}
}
