package com.youcode.service;

import static org.junit.Assert.*;

import org.junit.Test;

import com.youcode.entity.User;

public class UserServiceImplTest {

	@Test
	public void test() {
		   User user = new User("Hassan","hassan@gmail.com", "Hmiyed","azerty");
	        UserService userService = null;
	        userService.saveUser(user);
	
	}

}
