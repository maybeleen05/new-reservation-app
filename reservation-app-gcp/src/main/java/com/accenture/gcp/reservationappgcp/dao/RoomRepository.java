package com.accenture.gcp.reservationappgcp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.accenture.gcp.reservationappgcp.entity.Room;

public interface RoomRepository extends JpaRepository<Room, Integer> {

}
