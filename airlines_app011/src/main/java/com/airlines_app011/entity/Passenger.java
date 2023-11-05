package com.airlines_app011.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "passengers")
public class Passenger {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String passengerFisrtName;
	private String passengerLastName;
	private String passengerEmail;
	private String passengerMobile;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getPassengerFisrtName() {
		return passengerFisrtName;
	}
	public void setPassengerFisrtName(String passengerFisrtName) {
		this.passengerFisrtName = passengerFisrtName;
	}
	public String getPassengerLastName() {
		return passengerLastName;
	}
	public void setPassengerLastName(String passengerLastName) {
		this.passengerLastName = passengerLastName;
	}
	public String getPassengerEmail() {
		return passengerEmail;
	}
	public void setPassengerEmail(String passengerEmail) {
		this.passengerEmail = passengerEmail;
	}
	public String getPassengerMobile() {
		return passengerMobile;
	}
	public void setPassengerMobile(String passengerMobile) {
		this.passengerMobile = passengerMobile;
	}
}
