package org.zerock.controller.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.zerock.domain.member.MemberDTO;
import org.zerock.service.member.MemberService;

@Controller
@RequestMapping("member")
public class MemberController {
	
	@Autowired
	private MemberService service;
	
	@GetMapping("signup")
	public void signup() {
		
	}
	
	@PostMapping("signup")
	public String signup(MemberDTO member, RedirectAttributes rttr ) {
		System.out.println(member);
		
		int cnt = service.insert(member);
		
		rttr.addFlashAttribute("message", "회원가입 되었습니다");
		return "redirect:/board/list";
		
		/*
			 * else { rttr.addFlashAttribute("message", "회원가입 실패하였습니다");
			 * rttr.addFlashAttribute("member", member); return "redirect:/member/signup"; }
			 
			 */
	}
	
	@GetMapping("list")
	public void list(Model model) { //dispatherServlet
		model.addAttribute("memberList", service.list());
	}
	

	@GetMapping({"information", "modify"})
	public void information(String id, Model model ) {
		MemberDTO member = service.get(id);
		
		model.addAttribute("member", member);
	}
	
	
	@PostMapping("information")
	public String information(MemberDTO member, String oldPassword, RedirectAttributes rttr) {
		MemberDTO oldmember = service.get(member.getId());
		
		rttr.addAttribute("id", member.getId());
		if (oldmember.getPassword().equals(oldPassword)) {
			return "redirect:/member/modify";
		} else {
			rttr.addFlashAttribute("message", "암호가 일치하지 않습니다.");
			return "redirect:/member/information";
		}
		
	}
	
	@PostMapping("modify")
	public String modify(MemberDTO member, RedirectAttributes rttr) {
	
		int cnt = service.update(member);
		
		if (cnt == 1) {
			rttr.addFlashAttribute("message", "회원 정보가 수정되었습니다.");
			return "redirect:/member/infomation";
		} else {
			rttr.addFlashAttribute("message", "회원 정보가 수정되지 않았습니다.");
			return "redirect:/member/modify";
		}
		
	}
	
	@PostMapping("remove")
	public String remove(String id, String oldPassword, RedirectAttributes rttr) {
		MemberDTO oldmember = service.get(id);
		
		if (oldmember.getPassword().equals(oldPassword)) {
			int cnt = service.remove(id);
			
			rttr.addFlashAttribute("message", "회원 탈퇴하였습니다.");
			
			return "redirect:/board/list";
			
		} else {
			rttr.addAttribute("id", id);
			rttr.addFlashAttribute("message", "암호가 일치하지 않습니다.");
			return "redirect:/member/information";
		}
		
	}
}

