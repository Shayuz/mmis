package com.diginepal.mmis.entities;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class Tenants extends BaseEntity{
	
	private String name;
	private String address;
	private String phonenumber;
	private String identity;
	private String identitynumber;
	private String tenantnumber;
	private String registernumber;
	private String registerdate;
	private String licenseprovider;
	private String phone;
	private String rentedpurpose;
	private String recordstatus;
	
	@ManyToOne
	@JoinColumn(name = "house_land")
	private Houseland houseland;
	
	@OneToOne
	private Occupation occupation;
	
	@OneToOne
	private Identitytype identitytype;
	
	@OneToOne
	private Businesstype businesstype;
	
	@OneToOne
	private User user;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getIdentity() {
		return identity;
	}

	public void setIdentity(String identity) {
		this.identity = identity;
	}

	public String getIdentitynumber() {
		return identitynumber;
	}

	public void setIdentitynumber(String identitynumber) {
		this.identitynumber = identitynumber;
	}

	public String getTenantnumber() {
		return tenantnumber;
	}

	public void setTenantnumber(String tenantnumber) {
		this.tenantnumber = tenantnumber;
	}

	public String getRegisternumber() {
		return registernumber;
	}

	public void setRegisternumber(String registernumber) {
		this.registernumber = registernumber;
	}

	public String getRegisterdate() {
		return registerdate;
	}

	public void setRegisterdate(String registerdate) {
		this.registerdate = registerdate;
	}

	public String getLicenseprovider() {
		return licenseprovider;
	}

	public void setLicenseprovider(String licenseprovider) {
		this.licenseprovider = licenseprovider;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
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

	public Occupation getOccupation() {
		return occupation;
	}

	public void setOccupation(Occupation occupation) {
		this.occupation = occupation;
	}

	public Identitytype getIdentitytype() {
		return identitytype;
	}

	public void setIdentitytype(Identitytype identitytype) {
		this.identitytype = identitytype;
	}

	public Businesstype getBusinesstype() {
		return businesstype;
	}

	public void setBusinesstype(Businesstype businesstype) {
		this.businesstype = businesstype;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	
	
}
