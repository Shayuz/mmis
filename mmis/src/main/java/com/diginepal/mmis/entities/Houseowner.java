package com.diginepal.mmis.entities;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;



@Entity
@Table(name="house_owner")
public class Houseowner extends BaseEntity {
	
	private String fname;
	private String mname;
	private String lname;
	private String maritalstatus;
	private String grandfathername;
	private String fathername;
	private String spousename;
	private String housenumber;
	private String permanentaddress;
	private String permanentaddressdisrtict;
	private String permanentaddressmunvc;
	private String permanentaddresswardno;
	private String temporaryaddress;
	private String gender;
	private String dobnep;
	private String phonenumber;
	private String mobno;
	private String email;
	private String pannumber;
	private String recordstatus;

	
	
	@OneToOne
	private Disabledtype disabledtype;
	
	@OneToOne
	private Occupation occupation;
	
	@OneToOne
	private Religion religion;
	
	@OneToOne
	private User inputter;
	
	@OneToOne
	private User authorizer;
	
	@OneToOne
	private Ethnicgroup ethnicgroup;
	
	@OneToOne
	private Educationtype educationtype;
	
	@OneToMany(mappedBy = "houseowner", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<Family> family;
	
	@OneToMany(mappedBy = "houseowner", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<Houseland> houseland;

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

	public String getMaritalstatus() {
		return maritalstatus;
	}

	public void setMaritalstatus(String maritalstatus) {
		this.maritalstatus = maritalstatus;
	}

	public String getGrandfathername() {
		return grandfathername;
	}

	public void setGrandfathername(String grandfathername) {
		this.grandfathername = grandfathername;
	}

	public String getFathername() {
		return fathername;
	}

	public void setFathername(String fathername) {
		this.fathername = fathername;
	}

	public String getSpousename() {
		return spousename;
	}

	public void setSpousename(String spousename) {
		this.spousename = spousename;
	}

	public String getHousenumber() {
		return housenumber;
	}

	public void setHousenumber(String housenumber) {
		this.housenumber = housenumber;
	}

	public String getPermanentaddress() {
		return permanentaddress;
	}

	public void setPermanentaddress(String permanentaddress) {
		this.permanentaddress = permanentaddress;
	}

	public String getPermanentaddressdisrtict() {
		return permanentaddressdisrtict;
	}

	public void setPermanentaddressdisrtict(String permanentaddressdisrtict) {
		this.permanentaddressdisrtict = permanentaddressdisrtict;
	}

	public String getPermanentaddressmunvc() {
		return permanentaddressmunvc;
	}

	public void setPermanentaddressmunvc(String permanentaddressmunvc) {
		this.permanentaddressmunvc = permanentaddressmunvc;
	}

	public String getPermanentaddresswardno() {
		return permanentaddresswardno;
	}

	public void setPermanentaddresswardno(String permanentaddresswardno) {
		this.permanentaddresswardno = permanentaddresswardno;
	}

	public String getTemporaryaddress() {
		return temporaryaddress;
	}

	public void setTemporaryaddress(String temporaryaddress) {
		this.temporaryaddress = temporaryaddress;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDobnep() {
		return dobnep;
	}

	public void setDobnep(String dobnep) {
		this.dobnep = dobnep;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getMobno() {
		return mobno;
	}

	public void setMobno(String mobno) {
		this.mobno = mobno;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPannumber() {
		return pannumber;
	}

	public void setPannumber(String pannumber) {
		this.pannumber = pannumber;
	}

	public String getRecordstatus() {
		return recordstatus;
	}

	public void setRecordstatus(String recordstatus) {
		this.recordstatus = recordstatus;
	}

	public Disabledtype getDisabledtype() {
		return disabledtype;
	}

	public void setDisabledtype(Disabledtype disabledtype) {
		this.disabledtype = disabledtype;
	}

	public Occupation getOccupation() {
		return occupation;
	}

	public void setOccupation(Occupation occupation) {
		this.occupation = occupation;
	}

	public Religion getReligion() {
		return religion;
	}

	public void setReligion(Religion religion) {
		this.religion = religion;
	}

	public User getInputter() {
		return inputter;
	}

	public void setInputter(User inputter) {
		this.inputter = inputter;
	}

	public User getAuthorizer() {
		return authorizer;
	}

	public void setAuthorizer(User authorizer) {
		this.authorizer = authorizer;
	}

	public Ethnicgroup getEthnicgroup() {
		return ethnicgroup;
	}

	public void setEthnicgroup(Ethnicgroup ethnicgroup) {
		this.ethnicgroup = ethnicgroup;
	}

	public Educationtype getEducationtype() {
		return educationtype;
	}

	public void setEducationtype(Educationtype educationtype) {
		this.educationtype = educationtype;
	}

	
	
	
}
