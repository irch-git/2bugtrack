package com.bugtrack2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bugtrack2.dao.IMemberRepository;
import com.bugtrack2.entities.MemberEntities;

@Controller
@RequestMapping("/members")
public class MemberController {
	
	@Autowired
	IMemberRepository memRepo;
	
	@GetMapping("/new")
	public String newMember(Model model) {
		
		MemberEntities aMember = new MemberEntities();
		
		model.addAttribute("memberHTML", aMember);
		
		return "/member/new-member";
	}
}
