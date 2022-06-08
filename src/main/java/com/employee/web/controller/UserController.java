package com.employee.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.employee.web.entity.User;
import com.employee.web.service.UserService;

public class UserController {

	@Autowired
	private UserService userService;
	
	@GetMapping("/register")
	public String addUser() {
		return "register-form";
	}
	
	@PostMapping("/register")
	public String addUser(User user, Model model) {
		userService.saveUser(user);
		model.addAttribute("message","User is Registered Successfully");
		return "register-form";
	}
}
