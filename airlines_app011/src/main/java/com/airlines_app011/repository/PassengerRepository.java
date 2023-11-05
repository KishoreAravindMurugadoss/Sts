package com.airlines_app011.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.airlines_app011.entity.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger, Long> {

	
}
