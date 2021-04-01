package com.youcode.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.youcode.DAO.UserDao;
import com.youcode.DAO.UserDaoImlp;
import com.youcode.entity.User;

@Service
public class UserServiceImpl implements UserService {
	
	// need to inject customer dao
	@Autowired
	private UserDao userDAO = new UserDaoImlp();
	
	@Override
	public List<User> getUsers() {
		return userDAO.getUsers();
	}

	@Override
	public void saveUser(User theUser) {
		userDAO.saveUser(theUser);		
	}

	@Override
	public User getUser(long theId) {
		return userDAO.getUser(theId);
	}

	@Override
	public void deleteUser(long theId) {
		userDAO.deleteUser(theId);
		
	}

	@Override
	public User validate(String email, String password){
		return userDAO.validate(email,password);
		
	}
	
	
	
}
