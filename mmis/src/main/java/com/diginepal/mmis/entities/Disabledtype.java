package com.diginepal.mmis.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="disabled_type")
public class Disabledtype extends BaseEntity {

	private String typehead;

	public String getTypehead() {
		return typehead;
	}

	public void setTypehead(String typehead) {
		this.typehead = typehead;
	}
	
	

}
