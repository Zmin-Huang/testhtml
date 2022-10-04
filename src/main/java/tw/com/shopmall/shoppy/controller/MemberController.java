package tw.com.shopmall.shoppy.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import tw.com.shopmall.shoppy.member.MemberBean;
import tw.com.shopmall.shoppy.service.MemberService;

@Controller
public class MemberController {
	
	@Autowired
	private MemberService memberService;


	@GetMapping("/member")
	public String login(MemberBean bean) {
		if (memberService.login(bean.getName(),bean.getPassword()) != null) {
			System.out.println(bean.getName());
			System.out.println(bean.getPassword());
			System.out.println(bean.getTel());
			return "redirect:/index.html";
		}
		return "redirect:/member.html";

	}

	@PostMapping("/member")
	public String newAc(@RequestParam Map<String, String> map) {

		MemberBean insert = new MemberBean();
		insert.setName(map.get("name"));
		insert.setPassword(map.get("password"));
		insert.setTel(map.get("tel"));
		insert.setMemmail(map.get("memmail"));

		if (insert != null && insert.getName() != "" && insert.getPassword() != "" && insert.getTel() != "" && insert.getMemmail() != "") {
			memberService.insert(insert);
			return "redirect:/member.html";
		} else {
			return "redirect:/register.html";
		}
	}

	@PostMapping("/renew")
	public String change(MemberBean bean) {
//		bean.setMemberid(session.getAttribute(map))
//		bean.setMemberid(1);
		
		//System.out.println(bean.getMemberid());
		if (bean.getMemberid()!=null) {
			memberService.update(bean);
			return "redirect:/fix.html";
		}
		return "redirect:/errorsfix.html";
	}
	
}
