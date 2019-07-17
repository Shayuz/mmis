package com.diginepal.mmis.entities;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table(name="branch")
public class Branch extends BaseEntity {

	private String details;
	
	@ManyToOne
	@JoinColumn(name = "company_id")
	private Company company;

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}
	

}
