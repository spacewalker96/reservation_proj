package com.youcode.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.youcode.DAO.ReservationDAO;
import com.youcode.DAO.ReservationDAOImpl;

import com.youcode.entity.Reservation;

@Service
public class ReservationServiceImp implements ReservationService {

	
	@Autowired
	private ReservationDAO reservationDao = new ReservationDAOImpl();
	@Override
	public void saveReservation(Reservation reservation) {
		reservationDao.saveReservation(reservation);
	}
//	@Override
//	public List<Reservation> getReservations() {
//		// TODO Auto-generated method stub
//		return ReservationDao.getReservations();
//	}
	@Override
	public Reservation getReservationById(long id) {
		// TODO Auto-generated method stub
		return reservationDao.getReservationById(id);
	}
	@Override
	public List<Reservation> getAllReservation() {
		// TODO Auto-generated method stub
		return reservationDao.getAllReservation();
	}
	@Override
	public void dropReservation(long id) {
		reservationDao.dropReservation(id);
		
	}
	@Override
	public Reservation updateReservation(Reservation reservation) {
		// TODO Auto-generated method stub
		return reservationDao.updateReservation(reservation);
	}
	@Override
	public List<Reservation> getReservationByConfirmation() {
		
		return reservationDao.getReservationByConfirmation();
	}
	
	

}
