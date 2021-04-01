package com.youcode.service;

import java.util.List;

import com.youcode.entity.Reservation;

public interface ReservationService {
	

	public void saveReservation(Reservation reservation);
//	public List<Reservation> getReservations();
	public Reservation getReservationById(long id);
    public List<Reservation> getAllReservation();
    public void dropReservation(long id);
    public Reservation updateReservation(Reservation reservation);
	List<Reservation> getReservationByConfirmation();


	

}
