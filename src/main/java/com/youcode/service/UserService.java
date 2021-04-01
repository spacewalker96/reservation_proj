package com.youcode.service;

import java.sql.SQLException;
import java.util.List;

import com.youcode.entity.User;

public interface UserService {

	public List<User> getUsers();

	public void saveUser(User user);

	public User getUser(long theId);

	public void deleteUser(long theId);
	
	public User validate(String email, String password);
	

}
