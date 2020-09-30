package com.eval.coronakit.controller;

import java.util.ArrayList;

import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.eval.coronakit.entity.User;


@Controller
public class HomeController {

	
	
	@GetMapping({ "", "/", "/home" })
	public String showHome() {
		return "index";
	}
	
	

	@RequestMapping("/header")
	public ModelAndView showHeader() {

		ModelAndView mv = new ModelAndView("header");
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		if (!(auth instanceof AnonymousAuthenticationToken) && auth.isAuthenticated()) {
			//String role = new ArrayList<>(auth.getAuthorities()).get(0).getAuthority();
			
			String	role = null;

			mv.addObject("username", auth.getName());
			
			if(auth.getName().equals("First")) {
			role="USER"	;
			}
			
			mv.addObject("role", role);
		}
		return mv;

	}

	@GetMapping("/register")
	public ModelAndView showRegisterationForm() {
		return new ModelAndView("registerFormPage", "user", new User());
	}

	/*
	 * @PostMapping("/register") public ModelAndView
	 * doRegisteration(@ModelAttribute("user") User user) { user.setRole("USER");
	 * user = userService.save(user); return new ModelAndView("index", "msg",
	 * "User got registered! with ID#" + user.getUserId()); }
	 */
}
