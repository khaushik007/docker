package com.accenture.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/docker")
public class HelloController {
	
	@GetMapping("/")
	public String hello() {
		return "hello";
	}
	
	@PostMapping("/user")
	public String hellouser(@RequestParam String user, Model model) {
		model.addAttribute("user",user);
		return "hello";
	}
	

}
