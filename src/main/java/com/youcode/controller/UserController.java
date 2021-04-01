package com.youcode.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.youcode.entity.User;
import com.youcode.service.UserService;

@Controller
@ComponentScan(basePackages = {"com.youcode"})
public class UserController {
	// need to inject our customer service
		@Autowired
		private UserService userService;
		
		static User user2;
		
//		@Autowired
//		private ReservationService reservationService;

		
//		
		//@GetMapping("/list")
		@RequestMapping(value = "/admin-user", method = RequestMethod.GET)
		public String listUsers(Model theModel) {
			
			// get customers from the service
			List theUsers = (List) userService.getUsers();
					
			// add the customers to the model
			theModel.addAttribute("users", theUsers);
			
			return "admin-user";
		}
	
//		@GetMapping("/showFormForAdd")
//		public String showFormForAdd(Model theModel) {
//			
//			// create model attribute to bind form data
//			User theUser = new User();
//			
//			theModel.addAttribute("user", theUser);
//			
//			return "user-form";
//		}
		
		//@PostMapping("/saveUser")
//		@RequestMapping(value = "/saveUser", method = RequestMethod.POST)
//		public String saveUser(@ModelAttribute("user1") User theUser) {
//			
//			
//			//User user = new User("a","a","a","a");
//			// save the customer using our service
//			Role role = new Role();
//			role.setIdRole(1);
//			theUser.setRole(role);;
//			userService.saveUser(theUser);
//			
//			return "redirect:/welcome";
////			return "home";
//		}
//		@RequestMapping(value = "/login", method = RequestMethod.POST)
//		public String login(@ModelAttribute("user1") User theUser) {
//			
//			String email = theUser.getEmail();
//			String password = theUser.getPassword();
//			if(userService.validate(email,password)) {
//			
//				return "home";
//				}
//			else return "error";
//		}
		@RequestMapping(value = "/login", method = RequestMethod.POST)
		public String login(@ModelAttribute("user1") User theUser) {
			
			String email = theUser.getEmail();
			String password = theUser.getPassword();
//			String userValidate = userService.validate(email,password);
//
//			if(userValidate.equals("Admin_Role"))
//			{
//				return "admin";
//			}
//			else if(userValidate.equals("Student_Role"))
//			{
//				return "home";
//			}
//			else return "error";
			user2 = userService.validate(email, password);
			if (!user2.equals(null)) {
				if(user2.getRole().getRoleName().equals("Admin_Role")) {
					return "admin-user";
				}else if ((user2.getRole().getRoleName().equals("Student_Role"))) {
					return "redirect:/reservform";
				}
			}

			return "login";
		}
		
		
		  @RequestMapping("/logout")
		    public String logout(HttpSession session) {
		        session.invalidate();
		        System.out.println("logout succeed");
		        return "redirect:/login";
		    }

		
		@RequestMapping(value = "/saveUser", method = RequestMethod.POST)
		public String saveUser(@ModelAttribute("user") User theUser)  
		{ 
		
			userService.saveUser(theUser);
		    return "login"; 

			
		}
		

}
