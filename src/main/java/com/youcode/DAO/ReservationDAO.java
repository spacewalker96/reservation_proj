package com.youcode.DAO;

import java.util.List;

import com.youcode.entity.Reservation;

public interface ReservationDAO {
	public void saveReservation(Reservation Reservation);
	public Reservation getReservationById(long id);
    public List<Reservation> getAllReservation();
    public void dropReservation(long id);
    public Reservation updateReservation(Reservation reservation);
	public List<Reservation> getReservationByConfirmation();


}
