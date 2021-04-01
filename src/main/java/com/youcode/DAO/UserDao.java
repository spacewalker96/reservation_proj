package com.youcode.DAO;

import java.sql.SQLException;
import java.util.List;

import com.youcode.entity.User;

public interface UserDao {
	public List<User> getUsers();
	public void saveUser(User user);
	public User getUser(long theId);
	public void deleteUser(long theId);
	//public String authenticateUser(User theUser);
//	void saveStudent(Student student);
//	boolean validate(String email, String password);
	User validate(String email, String password);
}
