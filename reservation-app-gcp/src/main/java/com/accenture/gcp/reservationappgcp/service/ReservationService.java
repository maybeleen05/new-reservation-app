package com.accenture.gcp.reservationappgcp.service;

import java.sql.Date;
import java.util.List;

import com.accenture.gcp.reservationappgcp.entity.Reservation;

public interface ReservationService {
	
	public List<Reservation> findAll();
	
	public Reservation findById(int theId);
	
	public List<Reservation> findByUsername(String theUsername);
	
	public List<Reservation> findByDate(Date checkIn, Date checkOut);
	
	public List<Reservation> searchByJava(java.util.Date utilDate);
	
	public void save(Reservation theReservation);
	
	public void deleteById(int theId);

	List<Reservation> searchBy(Date theDate);

}
