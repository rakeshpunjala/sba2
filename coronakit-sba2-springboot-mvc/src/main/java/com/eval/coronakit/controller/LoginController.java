package com.eval.coronakit.controller;

import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

	
	@RequestMapping("/custom-login")
	public String login() {
		return "login-form";
	}
	
	@RequestMapping("/custom-error")
	public String error() {
		return "error-page";
	}
	
	@GetMapping("/login")
	public String gotoLogin() {
		String view = "login-form";
     return view;
	}
	
	@PostMapping("/user")
	public String validateLogin() {
	
	String view="index";	
		
	return view;
	}
		
	@PostMapping("/admin")
	public String adminLogin() {
	
	String view="index";	
		
	return view;
	
	}	
}
