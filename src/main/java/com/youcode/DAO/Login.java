package com.youcode.DAO;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Component;

import com.youcode.config.HibernateUtil;
import com.youcode.entity.User;

@Component
public class Login {

//    public User login(String user) {
//
//        //Connection
//        Session session = HibernateUtil.getSessionFactory().openSession();
//        Transaction ts = session.beginTransaction();
//        //get user from database
//        User userr = (User) session.createQuery("From User Where email = :email").setParameter("email", user).uniqueResult();
//        ts.commit();
//        session.close();
//
//        return userr;
//    }
	
	public String authenticateUser(String email, String password) {

        Transaction transaction = null;
		Session currentSession = null;

        User user = null;
        try  {
        	currentSession = HibernateUtil.getSessionFactory().openSession();
            // start a transaction
            transaction = currentSession.beginTransaction();
            // get an user object
            user = (User) currentSession.createQuery("FROM User U WHERE U.email = :email").setParameter("email", email).uniqueResult();
            if(user.getEmail().equals(email) && user.getPassword().equals(password) && user.getRole().getRoleName().equals("admin"))
                return "Admin_Role";
            else if(user.getEmail().equals(email) && user.getPassword().equals(password) && user.getRole().getRoleName().equals("student"))
                return "Student_Role";
//            else if(user.getEmail().equals(email) && user.getPassword().equals(password) && user.getRole().getRoleName().equals("formateur"))
//                return "Formateur_Role";
            // commit transaction
            transaction.commit();

        } catch (Exception e) {

            e.printStackTrace();
        }
        return "false";
    }

}
