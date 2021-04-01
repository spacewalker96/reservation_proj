package com.youcode.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.youcode.entity.Reservation;
import com.youcode.entity.User;

@Controller
public class HomeController {

	
	@RequestMapping(value="/")
	public ModelAndView test(HttpServletResponse response) throws IOException{
		return new ModelAndView("home");
	}
	
	@RequestMapping("/login")
	public String login(Model theModel) {
		User user = new User();
		theModel.addAttribute("user1",user);
		return "login";
	}

	@RequestMapping("/register")
	public String register(Model theModel) {
		
		User user = new User();
		
		theModel.addAttribute("user",user);
		
		
	return "reg";
	}
	
	
	@RequestMapping("/reservation")
	public String reservation(Model theModel) {
		
		Reservation reservation = new Reservation();
		
		theModel.addAttribute("reservation",reservation);
		
		
	return "reservation";
	}
	
//	
	@RequestMapping("/reservform")
	public String reservform() {
		return "reservform";
	}
	@RequestMapping("/error")
	public String error() {
		return "error";
	}
	@RequestMapping("/welcome")
	public String welcome() {
		return "welcome";
	}
}
