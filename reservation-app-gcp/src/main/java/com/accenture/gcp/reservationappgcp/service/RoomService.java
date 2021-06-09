package com.accenture.gcp.reservationappgcp.service;

import java.util.List;

import com.accenture.gcp.reservationappgcp.entity.Room;

public interface RoomService {
	
	public List<Room> findAll();
	
	public Room findById(int theId);
	
	public void save(Room theRoom);
	
	public void deleteById(int theId);

}
