package com.diginepal.mmis.entities;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="house_rent")
public class Houserent extends BaseEntity{
	
	private String rentedstoried;
	private String rentedroom;
	private String rentedfrom;
	private String rentedpurpose;
	private String recordstatus;
	

	@OneToOne
	private Houseland houseland;
	

	@OneToOne
	private User user;


	public String getRentedstoried() {
		return rentedstoried;
	}


	public void setRentedstoried(String rentedstoried) {
		this.rentedstoried = rentedstoried;
	}


	public String getRentedroom() {
		return rentedroom;
	}


	public void setRentedroom(String rentedroom) {
		this.rentedroom = rentedroom;
	}


	public String getRentedfrom() {
		return rentedfrom;
	}


	public void setRentedfrom(String rentedfrom) {
		this.rentedfrom = rentedfrom;
	}


	public String getRentedpurpose() {
		return rentedpurpose;
	}


	public void setRentedpurpose(String rentedpurpose) {
		this.rentedpurpose = rentedpurpose;
	}


	public String getRecordstatus() {
		return recordstatus;
	}


	public void setRecordstatus(String recordstatus) {
		this.recordstatus = recordstatus;
	}


	public Houseland getHouseland() {
		return houseland;
	}


	public void setHouseland(Houseland houseland) {
		this.houseland = houseland;
	}


	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}
	
	
}
