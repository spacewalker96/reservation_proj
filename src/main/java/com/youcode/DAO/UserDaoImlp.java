package com.youcode.DAO;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.youcode.config.HibernateUtil;
import com.youcode.entity.Role;
import com.youcode.entity.User;


@Repository
public class UserDaoImlp implements UserDao {


	
	@Override
	public List<User> getUsers() {
		
		List<User> list = new ArrayList<User>();
		Session currentSession = null;
		Transaction transactional = null;
		try {
    		currentSession = HibernateUtil.getSessionFactory().getCurrentSession();		
			 transactional = currentSession.beginTransaction();
			 
				 list = currentSession.createQuery("from User").list();	
				 transactional.commit();
		} catch (Exception e) {
			if (transactional != null) {
				transactional.rollback();
				e.printStackTrace();
			}
		}
		return list;
	}

//	@Override
//	public void saveUser(User user) {
//		Session currentSession = null;
//		Transaction transactional = null;
//		//User user1= new User();
//		try {
//			currentSession = HibernateUtil.getSessionFactory().getCurrentSession();
//			transactional = currentSession.beginTransaction();
//			currentSession.persist(user);
//			transactional.commit();
//		} catch (Exception e) {
//			if (transactional != null) {
//				transactional.rollback();
//				e.printStackTrace();
//			}
//		}			
//	}
	
	
	@Override
	public void saveUser(User user) {
		Session currentSession = null;
		Transaction transactional = null;
		//User user1= new User();
		
		try {
			currentSession = HibernateUtil.getSessionFactory().getCurrentSession();
			transactional = currentSession.beginTransaction();
			long theId = 1;
			Role role = currentSession.get(Role.class, theId);
			user.setRole(role);
			currentSession.persist(user);
			transactional.commit();
		} catch (Exception e) {
			if (transactional != null) {
				transactional.rollback();
				e.printStackTrace();
			}
		}			
	}
	

	

//	@Override
//	public void saveStudent(Student student) {
//		Session currentSession = null;
//		Transaction transactional = null;
//		try {
//			currentSession = HibernateUtil.getSessionFactory().getCurrentSession();
//			transactional = currentSession.beginTransaction();
//			currentSession.persist(student);
//			transactional.commit();
//		} catch (Exception e) {
//			if (transactional != null) {
//				transactional.rollback();
//				e.printStackTrace();
//			}
//		}			
//	}

	@Override
	public User getUser(long theId) {
		Session currentSession = null;
		Transaction transactional = null;
		User  user = null;
		try {
	    currentSession = HibernateUtil.getSessionFactory().getCurrentSession();
		transactional = currentSession.beginTransaction();
		long id = 1;
		Role role = currentSession.get(Role.class, id);
		user.setRole(role);
	user = currentSession.get(User.class, theId);
		transactional.commit();

		} catch (Exception e) {
			if (transactional != null) {
				transactional.rollback();
				e.printStackTrace();
			}
		}
		return user;
	}

	@Override
	public void deleteUser(long theId) {
		Session currentSession = null;
		Transaction transactional = null;
		try {
			     currentSession = HibernateUtil.getSessionFactory().getCurrentSession();
				transactional = currentSession.beginTransaction();

				Query theQuery = 
				currentSession.createQuery("delete from User where id=:idUser");
				theQuery.setParameter("idUser", theId);
				theQuery.executeUpdate();
//			    currentSession.delete(theId);
				transactional.commit();

		} catch (Exception e) {
			if (transactional != null) {
				transactional.rollback();
				e.printStackTrace();
			}
		}

	}
	
	
//	@Override
//    public boolean validate(String email, String password){
//        Transaction transaction = null;
//        User user = null;
//        try {
//            // start a transaction
//            Session session = HibernateUtil.getSessionFactory().openSession();
//            transaction = session.beginTransaction();
//            // get an user object
//            user = (User) session.createQuery("FROM User U WHERE U.email= :email").setParameter("email", email)
//                    .uniqueResult();
//
//            if (user != null && user.getPassword().equals(password)) {
//                return true;
//            }
//            // commit transaction
//            transaction.commit();
//        } catch (Exception e) {
//            if (transaction != null) {
//                transaction.rollback();
//            }
//            e.printStackTrace();
//        }
//        return false;
//    }
	 @Override
	    public User validate(String email, String password) {

	        Transaction transaction = null;
	        User user = null;
	        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
	            // start a transaction
	            transaction = session.beginTransaction();
	            // get an user object
	            user = (User) session.createQuery("FROM User U WHERE U.email = :email").setParameter("email", email).uniqueResult();
//	            if(user.getEmail().equals(email) && user.getPassword().equals(password) && user.getRole().getRoleName().equals("Admin_Role"))
//	                return "Admin_Role";
//	            else if(user.getEmail().equals(email) && user.getPassword().equals(password) && user.getRole().getRoleName().equals("Student_Role"))
//	                return "Student_Role";
//	            else if(user.getEmail().equals(email) && user.getPassword().equals(password) && user.getRole().getRoleName().equals("formateur"))
//	                return "Formateur_Role";
	            // commit transaction
	            transaction.commit();

	        } catch (Exception e) {

	            e.printStackTrace();
	        }
	        return user;
	    }

	    public List<User> getListOfUsers() {
	        List<User> list = new ArrayList<User>();
	        Session session = HibernateUtil.getSessionFactory().openSession();
	        Transaction tx = null;
	        try {
	            tx = session.getTransaction();
	            tx.begin();
	            list = session.createQuery("from User").list();
	            tx.commit();
	        } catch (Exception e) {
	            if (tx != null) {
	                tx.rollback();
	            }
	            e.printStackTrace();
	        }
	        return list;
	    }





}
