package com.diginepal.mmis.entities;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="house_land")
public class Houseland extends BaseEntity {

	private String name;
	
	@OneToOne
	private Constructiontype constructiontype;
	
	@ManyToOne
	@JoinColumn(name = "house_owner")
	private Houseowner houseowner;
	
	@ManyToOne
	@JoinColumn(name = "family")
	private Family family;
	
	@OneToOne
	private Disabledtype disabledtype;
	
	@OneToOne
	private Ownershiptype ownershiptype;
	
	


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
