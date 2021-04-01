package com.youcode.test;

import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import com.youcode.DAO.ReservationDAO;
import com.youcode.DAO.ReservationDAOImpl;
import com.youcode.entity.Reservation;
import com.youcode.entity.Role;
import com.youcode.entity.User;
import com.youcode.service.ReservationService;
import com.youcode.service.ReservationServiceImp;
import com.youcode.service.UserService;
import com.youcode.service.UserServiceImpl;

public class Test {
	public static void main(String[] args) {
		Date date = new Date(System.currentTimeMillis());
		LocalDate date1 = LocalDate.now();
		Role role = new Role();
		role.setIdRole(1L);
		Role role1 = new Role();
		role.getIdRole();
		LocalDate dt = LocalDate.parse( 
			    "22/01/2010" , 
			    DateTimeFormatter.ofPattern( "dd/MM/yyyy" ) 
			);
		
		User user = new User("Hassan", "Hmiyed", "hassan@gmail.com", "azerty");
		User user1 = new User("fghjkjhgf", "Hmiyed", "hassan1@gmail.com", "azerty");
//		user.getRole().getRoleName().equals("ROLE_ADMIN");
				
		UserService userService = new UserServiceImpl();
		ReservationDAO reserv = new ReservationDAOImpl();
Reservation res = new Reservation();
		// System.out.println(dt);
		//Reservation reservation = new Reservation(3, date);
       
		//userService.saveUser(user);
		//userService.saveUser(user1);

		
       System.out.println();

	}
}
