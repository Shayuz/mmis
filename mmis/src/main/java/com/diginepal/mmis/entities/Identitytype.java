package com.diginepal.mmis.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="identity_type")
public class Identitytype extends BaseEntity {

	private String type;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	

}
