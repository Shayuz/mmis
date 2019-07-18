package com.diginepal.mmis.entities;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="owner_identity_detail")
public class Owneridentitydetail {
	
	private String idtype;
	private String idnumber;
	private String issuedate;
	private String expirydate;
	private String issuedby;
	private String recordstatus;
	
	

	@OneToMany(mappedBy = "owneridentitydetail", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<Houseowner> houseowner;
	
	@OneToOne
	private User inputter;
	
	@OneToOne
	private User authorizer;

	public String getIdtype() {
		return idtype;
	}

	public void setIdtype(String idtype) {
		this.idtype = idtype;
	}

	public String getIdnumber() {
		return idnumber;
	}

	public void setIdnumber(String idnumber) {
		this.idnumber = idnumber;
	}

	public String getIssuedate() {
		return issuedate;
	}

	public void setIssuedate(String issuedate) {
		this.issuedate = issuedate;
	}

	public String getExpirydate() {
		return expirydate;
	}

	public void setExpirydate(String expirydate) {
		this.expirydate = expirydate;
	}

	public String getIssuedby() {
		return issuedby;
	}

	public void setIssuedby(String issuedby) {
		this.issuedby = issuedby;
	}

	public String getRecordstatus() {
		return recordstatus;
	}

	public void setRecordstatus(String recordstatus) {
		this.recordstatus = recordstatus;
	}

	public Set<Houseowner> getHouseowner() {
		return houseowner;
	}

	public void setHouseowner(Set<Houseowner> houseowner) {
		this.houseowner = houseowner;
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
	
	
	
	

}
