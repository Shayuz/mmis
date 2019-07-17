package com.diginepal.mmis.entities;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="family")
public class Family extends BaseEntity {

	private String fname;
	private String mname;
	private String lname;
	private String relation;
	private String maritalstatus;
	private String dobnep;
	private String gender;
	
	@OneToOne
	private Disabledtype disabledtype;
	
	@OneToOne
	private Occupation occupation;
	
	@OneToOne
	private User user;
	
	@ManyToOne
	@JoinColumn(name = "house_owner")
	private Houseowner houseowner;

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getMname() {
		return mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getRelation() {
		return relation;
	}

	public void setRelation(String relation) {
		this.relation = relation;
	}

	public String getMaritalstatus() {
		return maritalstatus;
	}

	public void setMaritalstatus(String maritalstatus) {
		this.maritalstatus = maritalstatus;
	}

	public String getDobnep() {
		return dobnep;
	}

	public void setDobnep(String dobnep) {
		this.dobnep = dobnep;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	
		

}
