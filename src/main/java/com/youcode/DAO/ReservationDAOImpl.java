package com.youcode.DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.youcode.config.HibernateUtil;
import com.youcode.entity.Reservation;

@Repository
public class ReservationDAOImpl implements ReservationDAO {

	@Override
	public void saveReservation(Reservation reservation) {
		Session currentSession = null;
		Transaction transactional = null;
		try {
			currentSession = HibernateUtil.getSessionFactory().getCurrentSession();
			transactional = currentSession.beginTransaction();
			currentSession.persist(reservation);
			transactional.commit();
		} catch (Exception e) {
			if (transactional != null) {
				transactional.rollback();
				e.printStackTrace();
			}
		}			
	}
	
//	@Override
//	public List<Reservation> getReservations() {
//		
//		List<Reservation> list = new ArrayList<Reservation>();
//		Session currentSession = null;
//		Transaction transactional = null;
//		try {
//    		currentSession = HibernateUtil.getSessionFactory().getCurrentSession();		
//			 transactional = currentSession.beginTransaction();
//				 list = currentSession.createQuery("from Reservation").list();	
//				 transactional.commit();
//		} catch (Exception e) {
//			if (transactional != null) {
//				transactional.rollback();
//				e.printStackTrace();
//			}
//		}
//		return list;
//	}
	
	@Override
    public Reservation getReservationById(long id) {
        Reservation reservation = null;
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            // get reservation by id
            reservation = (Reservation) session.get(Reservation.class, id);
            System.out.println("Reservation  !");
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return reservation;
    }

    @Override
    public List<Reservation> getAllReservation() {
        Session session;
        session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        List<Reservation> reservationList = session.createQuery("From Reservation").list();
        session.getTransaction().commit();
        return reservationList;

    }

    @Override
    public void dropReservation(long id) {
        Session session;
        Reservation reservation;
        session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        reservation = (Reservation) session.get(Reservation.class, id);

        if (reservation != null){
            session.delete(reservation);
            session.flush();
            System.out.println("drop Reservation");
        }else{
            System.out.println("Reservation Not Exist");
        }
        session.getTransaction().commit();

    }

    @Override
    public Reservation updateReservation(Reservation reservation) {
        Session session;
        Reservation reservationUpdate;
        session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        reservationUpdate = (Reservation) session.get(Reservation.class, reservation.getIdReservation());

        if(reservationUpdate != null) {
            reservationUpdate.setIdReservation(reservation.getIdReservation());
            reservationUpdate.setDateReservation(reservation.getDateReservation());
            reservationUpdate.setConfirmation(reservation.isConfirmation());
            reservationUpdate.setNbrPlacetablesByIdReservation(reservation.getNbrPlacetablesByIdReservation());
            reservationUpdate.setUser(reservation.getUser());

            System.out.println("Reservation updated");


        }else{
            System.out.println("Reservation Not Exist");
        }
        session.getTransaction().commit();
        return reservationUpdate;
    }
    
    
	
	 @Override
	    public List<Reservation> getReservationByConfirmation() {
	        Session session;
	        session = HibernateUtil.getSessionFactory().openSession();
	        session.beginTransaction();

//	        boolean confirm = true;
//	    	Reservation reservation = currentSession.get(Role.class, theId);
//	    	user.setRole(role);
	        List<Reservation> reservationList = session.createQuery("From Reservation where confirmation = true").list();
	        session.getTransaction().commit();
	        return reservationList;

	    }

	
	}


