package com.airlines_app011.services;

import java.util.List;

import com.airlines_app011.entity.Passenger;

public interface PassengerService {

	public void savePassInfo(Passenger pass);
	
	public List <Passenger> listallData(Passenger pass);
	
	public Passenger updateOnePass(long id);
	
	public void updateOneData(Passenger pass);
	
	public void deleteOnePass(long id);
}
