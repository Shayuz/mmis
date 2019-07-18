package com.diginepal.mmis.entities;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="housefacility")
public class Housefacility extends BaseEntity {
	
	private String drinkingwatersuffenciency;
	private String drainagemanagement;
	private String electricityfacility;
	private String streetlightfacility;
	private String telephonefacility;
	private String internetfacilty;
	private String tvfacility;
	private String roadwidth;
	private String recordstatus;
	
	@OneToOne
	private Drinkingwatertype drinkingwatertype;
	
	@OneToOne
	private Houseland houseland;
	
	@OneToOne
	private Roadtype roadtype;
	
	@OneToOne
	private User user;
	

	public String getDrinkingwatersuffenciency() {
		return drinkingwatersuffenciency;
	}

	public void setDrinkingwatersuffenciency(String drinkingwatersuffenciency) {
		this.drinkingwatersuffenciency = drinkingwatersuffenciency;
	}

	public String getDrainagemanagement() {
		return drainagemanagement;
	}

	public void setDrainagemanagement(String drainagemanagement) {
		this.drainagemanagement = drainagemanagement;
	}

	public String getElectricityfacility() {
		return electricityfacility;
	}

	public void setElectricityfacility(String electricityfacility) {
		this.electricityfacility = electricityfacility;
	}

	public String getStreetlightfacility() {
		return streetlightfacility;
	}

	public void setStreetlightfacility(String streetlightfacility) {
		this.streetlightfacility = streetlightfacility;
	}

	public String getTelephonefacility() {
		return telephonefacility;
	}

	public void setTelephonefacility(String telephonefacility) {
		this.telephonefacility = telephonefacility;
	}

	public String getInternetfacilty() {
		return internetfacilty;
	}

	public void setInternetfacilty(String internetfacilty) {
		this.internetfacilty = internetfacilty;
	}

	public String getTvfacility() {
		return tvfacility;
	}

	public void setTvfacility(String tvfacility) {
		this.tvfacility = tvfacility;
	}

	public String getRoadwidth() {
		return roadwidth;
	}

	public void setRoadwidth(String roadwidth) {
		this.roadwidth = roadwidth;
	}

	public String getRecordstatus() {
		return recordstatus;
	}

	public void setRecordstatus(String recordstatus) {
		this.recordstatus = recordstatus;
	}

	public Drinkingwatertype getDrinkingwatertype() {
		return drinkingwatertype;
	}

	public void setDrinkingwatertype(Drinkingwatertype drinkingwatertype) {
		this.drinkingwatertype = drinkingwatertype;
	}

	public Houseland getHouseland() {
		return houseland;
	}

	public void setHouseland(Houseland houseland) {
		this.houseland = houseland;
	}

	public Roadtype getRoadtype() {
		return roadtype;
	}

	public void setRoadtype(Roadtype roadtype) {
		this.roadtype = roadtype;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	

}
